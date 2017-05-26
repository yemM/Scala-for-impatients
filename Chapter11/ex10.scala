object RichFile
{
  def unapplySeq(filePath: String): Option[Seq[String]] = {
    Some(filePath.split('/').filter(_.nonEmpty))
  }
}

"/home/cay/readme.txt" match {
  case RichFile(first) => println(s"'$first'")
  case RichFile(first, second) => println(s"'$first' '$second'")
  case RichFile(first, second, third) => println(s"'$first' '$second' '$third'")
  case RichFile(first, second, third, fourth) => println(s"'$first' '$second' '$third' '$fourth'")
}