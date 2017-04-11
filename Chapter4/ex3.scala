val filename = "alice.txt"

def words(filename: String): Map[String,Int] = {
  val in = new java.util.Scanner(new java.io.File(filename))
  
  var words = Map[String,Int]()
  while (in.hasNext) {
    val word = in.next
    words = if (words.contains(word)) {
      val wordCount = words(word)
      words.-(word).+(word -> (wordCount + 1))
    } else {
      words.+(word -> 1)
    }
  }
  words
}

for ((word,wordCount) <- words(filename)) {
  println(word, wordCount)
}
