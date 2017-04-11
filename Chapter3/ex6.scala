var a = Array(1,2,3,4,5,6,7,8,9,10)

def reverse(a: Array[Int]) = {
  for(v <- a.reverse) yield v
}

println(reverse(a).mkString(","))
