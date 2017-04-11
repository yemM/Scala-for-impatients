val arr = Array(1,2,3,4,5)

var prodArr = for (value <- arr if value % 2 == 0) yield 2 * value;
println(prodArr.mkString(","))

for (v <- prodArr) {
  println(v)
}

import collection.mutable._

def swapL(a: Array[Int]) = {
  for(i <- 0 until a.length) yield if(i % 2 == 0)
        if(i == a.length-1)
          a(i)
        else
          a(i+1)
      else a(i-1)
}

def swapR(a: Array[Any]): Array[Any] = {
  if(a.length <= 1) {
    a
  } else if(a.length == 2) {
    Array(a(1),a(0))
  } else {
    var aB = ArrayBuffer[Any]()
    aB ++= Array(a(1),a(0))
    aB ++= swapR(a.slice(2,a.length))
    aB.toArray
  }
}

println("Array(1,2,3,4,5) L",swapL(Array(1,2,3,4,5)).mkString(","))
println("Array(1,2,3,4,5) R",swapR(Array(1,2,3,4,5)).mkString(","))
