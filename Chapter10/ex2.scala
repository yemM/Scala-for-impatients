import math.Ordered
import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends Point(x,y) with Ordered[Point]
{
	def compare(that: Point) =  {
		if(this.getX == that.getX && this.getY == that.getY) {
			0
		} else if (this.getX <= that.getX && this.getY < that.getY) {
			1
		} else {
			-1
		}
	}
}

val oPoint = new OrderedPoint(10,20)

println(oPoint.compare(new Point(10,20)))
println(oPoint.compare(new Point(15,30)))
println(oPoint.compare(new Point(5,30)))