import io.Source

val srcPattern = """<img.*src="([a-zA-Z0-9\?\=\:\/\-\_\.]*)".*\/?>""".r
val xkcdPage = Source.fromURL("https://xkcd.com/").mkString

for(srcPattern(url) <- srcPattern.findAllMatchIn(xkcdPage)) {
	println(url)
}

