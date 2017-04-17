package com {
	package horstmann {
		class Util

		package impatient {
			class Manager {
				def hello {
					new Util
				}
			}
		}
	}
}

package com.horstmann.impatient{
	class Employee {
		def hello {
			new Util // this will throw an Exception "error: not found: type Util"
		}
	}
}

object Example extends App {
	println("hello world")
}