import io.Source
import java.io._

if(!new File("comics.tsv").exists) {
	println("File comics.tsv does not exists, downloading it ...")
	val distantComics = Source.fromURL("https://comic.browserling.com/java.tsv")
	val comicsFile = new PrintWriter("comics.tsv")
	val comicsIt = distantComics.getLines()


	while(comicsIt.hasNext) {
		val line = comicsIt.next
		comicsFile.println(line)
	}

	comicsFile.close
	distantComics.close
}

val comics = Source.fromFile("comics.tsv")
val comicsOut = new PrintWriter("comics.tsv.out")
val tabPattern = """\t""".r
val it = comics.getLines

while(it.hasNext) {
	val line = it.next
	comicsOut.println(tabPattern.replaceAllIn(line, "    "))
}

comics.close
comicsOut.close

new File("comics.tsv").delete
new File("comics.tsv.out").renameTo(new File("comics.tsv"))