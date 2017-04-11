var gizmos = Map("VR headset" -> 800.0, "Colored light bubble" -> 12.50)

def discount(gizmos: Map[String, Double]): Map[String, Double] = {
  for((gizmo, price) <- gizmos) yield (gizmo, price * 0.9)
}

println(discount(gizmos).mkString(", "))
