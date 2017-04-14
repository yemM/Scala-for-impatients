class Person(name: String = "") {
	val firstName = name.split(" ").head
	val lastName = name.split(" ").tail.mkString(" ")
}

val p1 = new Person("John Doe")
println(p1.firstName, p1.lastName)

val p2 = new Person("James Doe Second")
println(p2.firstName, p2.lastName)