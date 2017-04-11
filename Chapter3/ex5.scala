var a = Array(10.0, 20.5, 31.3)

def avg(a: Array[Double]) = {
  a.foldLeft[Double](0)((v1,v2) => v1+v2 ) / a.length
}

println(avg(a))
