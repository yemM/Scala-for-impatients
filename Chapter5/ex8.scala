class Car(
		val manufacturer: String,
		val modelName: String,
		val modelYear: Int = -1,
		var licensePlate: String = ""
	) {

	def this(
		manufacturer: String,
		modelName: String,
		licensePlate: String
	) {
		this(manufacturer, modelName, -1, licensePlate)
	}
}

var c1 = new Car("Renault", "19", 1988, "aaa123zzz")
var c2 = new Car("Peugeot", "403", "abc111xyz")

println(c1.manufacturer, c1.modelName, c1.modelYear, c1.licensePlate)
println(c2.manufacturer, c2.modelName, c2.modelYear, c2.licensePlate)