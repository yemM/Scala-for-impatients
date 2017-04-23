import java.io.PrintWriter
import Math._

val writer = new PrintWriter("powers.txt")

for (p <- 0 to 20) writer.println(pow(2,p).toLong + "\t" + pow(2,-p).toDouble)

writer.close