import collection.JavaConverters

val props = JavaConverters.propertiesAsScalaMap(System.getProperties())

val longest = props.keys.foldLeft("")((prevProp,prop) => { if(prevProp.length >= prop.length) prevProp else prop })
for ((name,value) <- props) {
	println(name + (" " * (longest.length - name.length)) + " | " + value)
}
