class Time(hrs: Int, min: Int){
	private[this] var minutes_ : Int = _

	this.minutes_ = if((hrs * 60 + min) < 0 || (hrs * 60 + min) > 1439) 0 else hrs * 60 + min

	def hours: Int = minutes_ / 60
	def minutes: Int = minutes_

	def before(other: Time): Boolean = {
		if (this.hours < other.hours) {
			true
		} else if (this.hours == other.hours && this.minutes < other.minutes) {
			true
		}else {
			false
		}
	}
}

val t1 = new Time(20,30)
println(t1.before(new Time(23,0)))
println(t1.before(new Time(20,50)))
println(t1.before(new Time(12,0)))
