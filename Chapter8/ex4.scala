abstract class Item
{
	def price:Double
	def description:String
}

class SimpleItem(override val price: Double, override val description: String) extends Item
{
}

class Bundle extends Item {
	private var items: Array[Item] = Array()
	
	override def price = {
		var totalPrice = 0.0

		for (item <- items) {
			totalPrice += item.price
		}

		totalPrice
	}

	override def description = {
		var descriptions = for (item <- items) yield item.description

		descriptions.mkString(" ")
	}

	def addItem(newItem: Item) = {
		items = items :+ newItem
		this
	}

}

val item1 = new SimpleItem(10, "Item 1 desc.")
val item2 = new SimpleItem(20, "Item 2 desc.")
val item3 = new SimpleItem(30, "Item 3 desc.")
val item4 = new SimpleItem(40, "Item 4 desc.")

val bundle = new Bundle

println(bundle.price, bundle.description)

bundle
	.addItem(item1)
	.addItem(item2)
	.addItem(item3)
	.addItem(item4)

println(bundle.price, bundle.description)