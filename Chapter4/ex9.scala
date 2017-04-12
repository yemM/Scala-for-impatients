val values = Array(12,33,4,55,667,3,2,155)

def lteqgt(values: Array[Int], v: Int) = {
	val lt = values.filter((p) => (p < v))
	val eq = values.filter((p) => (p == v))
  val gt = values.filter((p) => (p > v))

  Tuple3(lt.length,eq.length, gt.length)
}

println(lteqgt(values,10).toString)