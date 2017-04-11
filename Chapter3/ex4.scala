var a = Array(-1,34,0,3,5,-20,60)

def sort(a: Array[Int]) = {
  var positives = for(v <- a if v > 0) yield v
  var zeroOrNegatives = for(v <- a if v <= 0) yield v

  positives ++ zeroOrNegatives
}

println(sort(a).mkString(","))
