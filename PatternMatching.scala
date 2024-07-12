object PatternMatching {
  private def matching(num : Int) : Unit = {
    num match {
      case x if x<=0 => println("Negative/Zero is Input")
      case x if x%2==0 => println("Even number is given")
      case x if x%2!=0 => println("Odd number is given")
    }
  }
  
  def main(args : Array[String]) : Unit = {
    matching(5)
  }
}
