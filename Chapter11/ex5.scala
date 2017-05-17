object Table
{
  def apply(): Table = {
    new Table()
  }
}

class Table(private val content: String = "")
{
  override def toString() = {
    s"<table><tr>$content</tr></table>"
  }

  def |(element: String): Table = {
    new Table(s"$content<td>$element</td>")
  }

  def ||(element: String): Table = {
    new Table(s"$content</tr><tr><td>$element</td>")
  }
}


println(Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM ,.NET")
