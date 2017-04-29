trait Logger {
	def log(msg: String) = {
    println(msg)
  }
}

trait CryptoLogger extends Logger {
	val key: Int = 3
	override def log(msg: String) = {
    super.log(msg.map((c: Char) => { (c + key).toChar }))
	}
}

class TheDefaultLogger extends CryptoLogger {
	
}

class TheLogger extends {
		override val key: Int = 15
	} with CryptoLogger {
    // magic !
	}


val log3 = new TheDefaultLogger()
val log15 = new TheLogger()
log3.log("hi!")
log15.log("hello")