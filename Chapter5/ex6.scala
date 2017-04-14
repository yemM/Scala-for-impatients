class Person(var age: Int = 0) {
	if (age < 0) age = 0
}

var p1 = new Person(12)
println(p1.age)

var p2 = new Person(-1)
println(p2.age)