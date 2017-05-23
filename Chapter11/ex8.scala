import collection.mutable.HashMap

class Matrix(private val maxCol: Int = 1, private val maxRow: Int = 1)
{
  private var matrix: HashMap[(Int, Int), Int] = new HashMap()

  def *(value: Int) = {
    matrix = matrix.map(
      (cellValue) => (cellValue._1, cellValue._2 * value)
    )
  }

  def +(value: Int) = {
    for (row <- 0 until maxRow; col <- 0 until maxCol) {
      if (matrix.contains(row, col)) matrix((row, col)) += value else matrix((row, col)) = value
    }
  }

  def apply(row: Int, col: Int): Int = {
    checkRange(row, col)
    if (matrix.contains(row, col)) matrix((row, col)) else 0
  }

  def update(row: Int, col: Int, value: Int): Unit = {
    checkRange(row, col)
    matrix((row, col)) = value
  }

  override def toString: String = {
    var mStr = "|"
    for (row <- 0 until maxRow; col <- 0 until maxCol) {
      mStr += " " + this.apply(row, col) + " |"
      if((maxCol - 1) == col && (maxRow - 1) > row) {
        mStr += "\n|"
      }
    }

    mStr
  }

  private def checkRange(row: Int, col: Int): Boolean = {
    if(row >= maxRow || col >= maxCol) {
      throw new IndexOutOfBoundsException
    } else {
      true
    }
  }
}

val m = new Matrix(3,4)
m(0,1) = 1
m(1,0) = 2
m(1,1) = 3
println(m)

try {
  m(4,1)
} catch {
  case outOfBound: IndexOutOfBoundsException => println(outOfBound)
  case _: Throwable => println("something went pretty bad")
}

try {
  m(4,2) = 10
} catch {
  case outOfBound: IndexOutOfBoundsException => println(outOfBound)
  case _: Throwable => println("something went pretty bad")
}


m + 3
println(m)

m * 5
println(m)
