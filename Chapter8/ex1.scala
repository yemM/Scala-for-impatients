class BankAccount(initialBalance: Double) {
	private var balance = initialBalance
	def currentBalance = balance
	def deposit(amount: Double) = { balance += amount; balance }
	def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double)  extends BankAccount(initialBalance) {
	private var balance = initialBalance
	override def deposit(amount: Double) = { balance += (amount - 1); balance }
	override def withdraw(amount: Double) = { balance -= (amount + 1); balance }
}

val BA = new BankAccount(15.0)
val CA = new CheckingAccount(15.0)

println(BA.deposit(5), CA.deposit(5))
println(BA.withdraw(3), CA.withdraw(3))