var days = new collection.mutable.LinkedHashMap[String,Int]()

println("1. insert Monday")
days += ("Monday" -> java.util.Calendar.MONDAY)

println("2. insert Wednesday")
days += ("Wednesday" -> java.util.Calendar.WEDNESDAY)

println("3. insert Tuesday")
days += ("Tuesday" -> java.util.Calendar.TUESDAY)

println("4. insert Thursday")
days += ("Thursday" -> java.util.Calendar.THURSDAY)

println("5. insert Friday")
days += ("Friday" -> java.util.Calendar.FRIDAY)

println("6. insert Sunday")
days += ("Sunday" -> java.util.Calendar.SUNDAY)

println("7. insert Saturday")
days += ("Saturday" -> java.util.Calendar.SATURDAY)

for ((name, number) <- days) {
	println(name,number)
}
