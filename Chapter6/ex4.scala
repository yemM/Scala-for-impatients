class Point(val x: Int, val y: Int) {
	def equals(other: Point): Boolean = x == other.x && y == other.y
}

object Point{
	def apply(x: Int, y: Int) = new Point(x,y)
}

val p = Point(10,42)
println(p.equals(new Point(10,42)), p.x, p.y)