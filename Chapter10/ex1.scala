trait RectangleLike[A] {

	def getX: Double
	def getY: Double
	def getWidth: Double
	def getHeight: Double
	def setFrame(x:Double, y:Double, w:Double, h:Double)



	def translate(dx: Int, dy: Int) = {
		setFrame(getX + dx, getY + dy, getWidth, getHeight)
	}

	def grow(dh: Int, dv: Int) = {
		setFrame(getX, getY, getWidth + dv, getHeight + dh)
	}
}

val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike[Double]

egg.translate(10, -10)
println(egg.getX, egg.getY)

egg.grow(10, 20)
println(egg.getWidth, egg.getHeight)