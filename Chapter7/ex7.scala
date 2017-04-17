class Converter {

	import java.util.{HashMap => JavaHashMap}
	import collection.mutable.{HashMap => ScalaHashMap}

	def convert(javaMap: JavaHashMap[_,_]): ScalaHashMap[_,_] = {
		import scala.language.existentials
		val it = javaMap.entrySet.iterator
		var scalaMap: ScalaHashMap[Any,Any] = null
		while (it.hasNext) {
			val entry = it.next
			scalaMap  = if(null == scalaMap) {
					ScalaHashMap(entry.getKey -> entry.getValue)
				} else {
					scalaMap ++ ScalaHashMap(entry.getKey -> entry.getValue)
				}
		}

		scalaMap
	}
}

var javaStringMap = new java.util.HashMap[String, String] { put("Jane","Doe"); put("John","Doe"); put("Marty","McFly") }
var javaIntMap = new java.util.HashMap[Int, String] { put(0,"Doe"); put(1,"Doe"); put(2,"McFly") }

val converter = new Converter()

println("String -> String")
for ((k,v) <- converter.convert(javaStringMap)) println(k,v)

println("Int -> String")
for ((k,v) <- converter.convert(javaIntMap)) println(k,v)