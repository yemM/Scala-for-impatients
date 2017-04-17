import java.lang.System

object MyApp extends App {
	val console = System.console
	
	var charSetPass = console.readPassword("Please enter your password : ")
	val password = new String(charSetPass)

	if("secret" == password) {
		System.out.println("Hi " + System.getProperty("user.name") + "!")
	} else {
		System.err.println("The password does not match")
	}
}