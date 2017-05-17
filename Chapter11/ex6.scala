object ASCIIArt
{
  def apply(figure: String): ASCIIArt = {
    new ASCIIArt(figure)
  }

  def unapply(art: ASCIIArt) = {
    Some(art.figure)
  }
}

class ASCIIArt(fig: String = "")
{
  private val figure: Array[String] = fig.split(System.lineSeparator)

  def /(other: ASCIIArt): ASCIIArt = {
    new ASCIIArt(this + "\n" + other);
  }

  def |(other: ASCIIArt): ASCIIArt = {
    var ASCIIArt(otherFigure) = other

    val figureCouples = if(getHeight > other.getHeight) {
        figure zip (otherFigure ++ new Array[String](getHeight - other.getHeight))
      } else {
        figure ++ new Array[String](other.getHeight - getHeight) zip otherFigure
      }

    val newFigure: String = figureCouples.foldLeft(""){ 
      (figureString, couple) => {
        val left = if (null == couple._1) "" else couple._1
        val right = if(null == couple._2) "" else couple._2

        figureString + left + " " * (getWidth() - left.size) + " " + right + "\n"
      }
    }

    ASCIIArt(newFigure)
  }
 
  private def getWidth(): Int = {
    val maxSize: Int = figure.foldLeft(0){
      (previousSize: Int, line: String) => {
        if(previousSize < line.size){
          line.size
        } else {
          previousSize
        }
      }
    }
    maxSize
  }

  private def getHeight(): Int = {
    figure.size
  }

  override def toString(): String = {
    figure.mkString("\n");
  }
}

val scala = ASCIIArt("  _________             .__          \n /   _____/ ____ _____  |  | _____   \n \\_____  \\_/ ___\\\\__  \\ |  | \\__  \\  \n /        \\  \\___ / __ \\|  |__/ __ \\_\n/_______  /\\___  >____  /____(____  /\n        \\/     \\/     \\/          \\/ ")

val is = ASCIIArt(".__        \n|__| ______\n|  |/  ___/\n|  |\\___ \\ \n|__/____  >\n        \\/ ")
  
val fun = ASCIIArt("  _____             \n_/ ____\\_ __  ____  \n\\   __\\  |  \\/    \\ \n |  | |  |  /   |  \\\n |__| |____/|___|  /\n                 \\/ ")

println(scala | is | fun)
println((scala | is) / fun)
println(scala / is / fun)
println(scala / (is | fun))
