import collection.immutable._

val filename = "alice.txt"

def words(filename: String): SortedMap[String,Int] = {
  val in = new java.util.Scanner(new java.io.File(filename))

  var words = SortedMap[String,Int]()

  while (in.hasNext) {
    val word = in.next

    words = if (words.contains(word)) {
      val count = words(word)
      words.-(word).+(word -> (count + 1))
    } else {
      words.+(word -> 1)
    }
  }

  words
}

for ((word,count) <- words(filename)) {
  println(word,count)
}
