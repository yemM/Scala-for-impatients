import java.awt.Rectangle

class Square(x: Int = 0, y: Int = 0, width: Int = 0) extends Rectangle(x, y, width ,width) {
	def this(width: Int) = {
		this(0 ,0 , width)
	}
}