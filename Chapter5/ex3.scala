class Time(hrs: Int, min: Int){
	private[this] var hours_ : Int = _
	private[this] var minutes_ : Int = _

	this.hours_ = if(hrs < 0 || hrs > 23) 0 else hrs
	this.minutes_ = if(min < 0 || min > 59) 0 else min

	def hours: Int = hours_
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
