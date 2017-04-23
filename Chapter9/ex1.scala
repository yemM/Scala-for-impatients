import io.Source
import java.io.PrintWriter

val alice = Source.fromFile("alice.txt")
val aliceReversed = new PrintWriter("alice-reversed.txt")

for (l <- alice.getLines.toArray.reverse) aliceReversed.println(l)

aliceReversed.close