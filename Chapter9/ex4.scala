import io.Source

val numbers = for (number <- Source.fromFile("floating-numbers.txt").getLines.toArray) yield { number.toDouble }

println(numbers.min,numbers.max,numbers.sum / numbers.size,numbers.sum)