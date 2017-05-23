object ASCIIArt
{
  def apply(figure: String): ASCIIArt = {
    new ASCIIArt(figure)
  }

  def unapply(art: ASCIIArt) = {
    Some(art.figure)
  }
}

class ASCIIArt(fig: String = "", private val spacing: Int = 5)
{
  private val figure: Array[String] = fig.split("\n")

  def /(other: ASCIIArt): ASCIIArt = {
    new ASCIIArt(this + "\n" + other);
  }

  def |(other: ASCIIArt): ASCIIArt = {
    var ASCIIArt(otherFigure) = other

    val figureCouples = figure zipAll(otherFigure, "", "")

    val newFigure: String = figureCouples.foldLeft(""){ 
      (figureString, couple) => {
        val padding = "%" + (getWidth() - couple._1.length + couple._2.length + spacing) + "s"
        figureString + couple._1 + padding.format(couple._2 + "\n")
      }
    }

    ASCIIArt(newFigure)
  }
 
  private def getWidth(): Int = {
    val maxSize: Int = figure.foldLeft(0){
      (previousSize: Int, line: String) => {
        if(previousSize < line.length){
          line.length
        } else {
          previousSize
        }
      }
    }
    maxSize
  }

  private def getHeight(): Int = {
    figure.length
  }

  override def toString(): String = {
    figure.mkString("\n");
  }
}

val scala = ASCIIArt("  _________             .__\n /   _____/ ____ _____  |  | _____\n \\_____  \\_/ ___\\\\__  \\ |  | \\__  \\\n /        \\  \\___ / __ \\|  |__/ __ \\_\n/_______  /\\___  >____  /____(____  /\n        \\/     \\/     \\/          \\/ ")

val is = ASCIIArt(".__\n|__| ______\n|  |/  ___/\n|  |\\___ \\ \n|__/____  >\n        \\/ ")
  
val fun = ASCIIArt("  _____\n_/ ____\\_ __  ____\n\\   __\\  |  \\/    \\\n |  | |  |  /   |  \\\n |__| |____/|___|  /\n                 \\/ ")

println(scala | is | fun)
println((scala | is) / fun)
println(scala / is / fun)
println(scala / (is | fun))
