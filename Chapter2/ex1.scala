def signum(x: Int): Int = {
  if(0 == x) {
    return 0
  }

  if(0 > x) {
    return -1
  }

  1
}
/**
println(signum(23))
println(signum(-42))
println(signum(0))
*/

/**
for (i <- 10 to 0 by -1) {
  println(i)
}
*/
def countdown(n: Int) {
  for(i <- n to 0 by -1) {
    println(i)
  }
}

//countdown(42)
var p1: Long = 1
for (i <- "Hello") {
  p1 = p1 * i.toInt
}
println(p1)

var p2: Long = 1
"Hello".foreach(c => {
  p2 *= c.toInt
})
println(p2)

var p3b = "Hello".foldLeft[Long](1)( (p3b,c) => { p3b * c.toInt })
println(p3b)

def product(s: String) = {
  s.foldLeft[Long](1)( (p,c) => { p * c.toInt })
}

println(product("Hello"))
println(product("world"))

def productRecursive(s: String): Long = {
  if(1 == s.length) {
    return s.head.toLong
  }

  s.head.toLong * productRecursive(s.tail)
}

println(productRecursive("a"))
println(productRecursive("Hello"))

import Math._
def power(x: Double, n: Int) = {
  if() {
  } else {
  }
}

println(power(2,2))
println(power(3,0))

