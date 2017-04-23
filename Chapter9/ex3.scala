import io.Source
for (w <- Source.fromFile("alice.txt").mkString.split("\\s+").filter(_.length > 12)) println(w)
