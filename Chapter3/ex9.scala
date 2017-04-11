def getAmerica = {
  var timezones = java.util.TimeZone.getAvailableIDs

  var america = timezones.filter((tz => {tz.startsWith("America")}))

  var cities = for(v <- america) yield v.slice("America/".length,v.length)
  cities.sorted
}

for(city <- getAmerica) {
  println(city)
}
