object NameFormatter {
  private def toUpper(name : String) : String = {
    name.toUpperCase
  }

  private def toLower(name : String) : String = {
    name.toLowerCase
  }

  private def formatNames(name : String)(format : String=>String) : String = {
    format(name)
  }

  def main(args : Array[String]) : Unit = {
    val names : Array[String] = Array("Benny",  "Niroshan", "Saman", "Kumara")

    println(formatNames(names(0))(toUpper))
    println(formatNames(names(1))(name => {
      name.substring(0,2).toUpperCase + name.substring(2).toLowerCase
    }))
    println(formatNames(names(2))(toLower))
    println(formatNames(names(3))(name => {
      name.substring(0,1).toUpperCase + name.substring(1,name.length-1).toLowerCase +
        name.substring(name.length-1).toUpperCase
    }))
  }
}
