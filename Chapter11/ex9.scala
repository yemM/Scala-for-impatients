object RichFile
{
  def unapply(fileName: String) = {
    val filePath = """([a-zA-Z0-9\s\-\/\.]+)/([a-zA-Z0-9\s\-\.]+)\.([a-z]{1,3})""".r
    val filePath(path, name, extension) = fileName
    Some((path, name, extension))
  }
}

val RichFile(path, name, extension) = "/home/cay/readme.txt"

println(s"found in '$path' the file '$name' of extension '$extension'")
