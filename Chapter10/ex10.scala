import java.io.{InputStream, FileInputStream}
import collection.{Iterable, Iterator}

trait IterableInputStream extends InputStream with Iterable[Byte]
{
  def iterator(): Iterator[Byte] = new Iterator[Byte] {
    val outer: IterableInputStream = IterableInputStream.this

    def hasNext(): Boolean = {
      outer.available() > 0
    }

    def next(): Byte = {
      outer.read().toByte
    }
  }

}

val stream = new FileInputStream("08.txt") with IterableInputStream
for (i <- stream) {
  println(i.toChar)
}

