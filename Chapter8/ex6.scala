import java.awt.Point

abstract class Shape {
	def centerPoint: Point
}

class Rectangle(val x: Int, val y: Int)  extends Shape {
	override def centerPoint: Point = {
		new Point(x,y)
	}
}

class Circle(val x: Int, val y: Int)  extends Shape {
	override def centerPoint: Point = {
		new Point(x,y)
	}
}

