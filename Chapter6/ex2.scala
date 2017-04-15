class UnitConversion(val factor: Double = 1) {
	def convert(value: Double): Double = value * factor
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78541178)
object MilesToKilometers extends UnitConversion(1.609344) {}

println(InchesToCentimeters.convert(2))
println(GallonsToLiters.convert(2))
println(MilesToKilometers.convert(2))
