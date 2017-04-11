def getAmerica = {
  var timezones = java.util.TimeZone.getAvailableIDs

  var america = timezones.filter((tz => {tz.startsWith("America")}))

  america
}

println(getAmerica.mkString(","))
