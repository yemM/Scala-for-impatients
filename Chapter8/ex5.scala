class Point(val x: Double, val y: Double)

class LabeledPoint(val label: String, override val x: Double, override val y: Double) extends Point(x,y)

val labeled = new LabeledPoint("hi",10,20)

println(labeled.label, labeled.x, labeled.y)