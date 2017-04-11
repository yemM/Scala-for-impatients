val filename = "alice.txt"

def countWords(filename: String): Map[String, Int] = {
  val in = new java.util.Scanner(new java.io.File(filename))
  var words = collection.mutable.Map[String,Int]()

  while(in.hasNext) {
    val word = in.next
    words(word) = words.getOrElse(word,0)+1
  }

  words.toMap
}

val words = countWords(filename)

for((word,count) <- words) {
  println(word, count)
}

