def sum(args: Int*) = {
  var result = 0
  
  for (arg <- args) {
    result += arg
  }

  result
}

println(sum(1,1,1,1))
println(sum(2,3,5))
println(sum(1 to 5: _*))

def tete(args: Int*) = {
  args.head
}

println(tete(15 to 100: _*))

try {
  throw new IllegalArgumentException("hi !")
} catch {
  case _: IllegalArgumentException => println("gotcha!")
} finally {
  println("hello instead")
}

