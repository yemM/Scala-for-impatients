//import App

object Reverter extends App {
	if(args.length > 0) {
		for(arg <- args.reverse) println(arg)
	} else {
		println("huh ?")
	}
}
