package random {
	object Generator {
		private[this] val a: Int = 1664525
		private[this] val b: Int = 1013904223
		private[this] val n: Int = 32

		private[random] def generate(previous: Double) = {
			import Math._
			(previous * a + b) % pow(2, n)
		}
	}

	package object random {
		private[this] var seed: Double = 0

		def setSeed(value: Int) {
			seed = value
		}
		
		def nextInt: Int = {
			seed = Generator.generate(seed)
			seed.toInt
		}

		def nextDouble: Double = {
			nextInt.toDouble
		}
	}
}

import random._

object MyApp extends App {
	println(random.nextInt, random.nextDouble)
	random.setSeed(42)
	println(random.nextInt, random.nextDouble)
}