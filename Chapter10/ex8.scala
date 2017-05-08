import java.io.{InputStream, FileInputStream}

trait BufferingTrait {

  this: InputStream =>
    val BUFFER_SIZE = 10
    val buffer = new Array[Byte](BUFFER_SIZE)
    var size: Int = 0
    var i: Int = 0

    override def read(): Int = {
      if (i >= size) {
        if(size > 0) -1
        
        size = this.read(buffer, 0, BUFFER_SIZE)
        i = 0
      }
      
      i += 1
      buffer(i-1)
    }
    
}

val file = new FileInputStream("08.txt") with BufferingTrait

for (i <- 1 to 26) println(file.read().toChar)
