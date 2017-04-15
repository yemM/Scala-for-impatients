object Conversions {
	def inchesToCentimeters(inches: Double): Double = {
		inches * 2.54
	}

	def gallonsToLiters(gallons: Double): Double = {
		gallons * 3.78541178
	}

	def milesToKilometers(miles: Double): Double = {
		miles * 1.609344
	}
}

println(Conversions.inchesToCentimeters(2))
println(Conversions.gallonsToLiters(2))
println(Conversions.milesToKilometers(2))