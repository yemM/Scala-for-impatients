import collection.JavaConversions.mapAsScalaMap
import java.util._
import java.io.File

val filename = "alice.txt"

def words(filename: String): Map[String,Int] = {
  val in = new Scanner(new File(filename))

  var words = new TreeMap[String,Int]

  while (in.hasNext) {
    val word = in.next
    words(word) = words.getOrElse(word, 0) + 1
  }

  words
}

for ((word,count) <- words(filename)) {
  println(word,count)
}
