package acme.com {
	class Person(val name: String = "John Doe")
}

import acme._

object MyApp extends App {
	val someone = new com.Person
	println(someone.name)
}