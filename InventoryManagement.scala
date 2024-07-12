object InventoryManagement {
  private val items : Array[String] = Array("Apple", "Banana", "Orange")
  private val quantities : Array[Int] = Array(12, 5, 10)

  private def displayInventory() : Unit = {
    for(i <- items.indices){
      println(items(i) + ":" + quantities(i))
    }
  }

  private def restockItem(item : String, quantity : Int) : Unit = {
    val index = items.indexOf(item)

    if(index >= 0){
      quantities(index) += quantity
      println("Restocked the item successfully")
      println(s"$item" + ":" + s"${quantities(index)}")
    }
    else
      println(s" $item does not exist in Inventory")
  }

  private def sellItem(item : String, quantity : Int) : Unit = {
    val index = items.indexOf(item)

    if(index >=0){
      if( quantities(index) >= quantity){
        quantities(index) -= quantity
        println("Sold the item successfully")
        println(s"$item" + ":" + s"${quantities(index)}")
      }

      else {
        println(s"Not enough $item in stock to sell ")
      }
    }

    else{
      println(s" $item does not exist in Inventory")
    }
  }

  def main (args : Array[String]) : Unit = {
    displayInventory()
    restockItem("Apple", 50)
    sellItem("Banana", 6)
    displayInventory()
  }
}
