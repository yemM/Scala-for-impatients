class Counter(private[this] var value: Long = 0) {
	def increment() { value += 1 }
	def current = value
}

var c : Counter = new Counter(Int.maxValue)
println(c.current)
c.increment()
println(c.current)