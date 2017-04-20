class BankAccount(initialBalance: Double) {
	private var balance = initialBalance
	def currentBalance = balance
	def deposit(amount: Double) = { balance += amount; balance }
	def withdraw(amount: Double) = { balance -= amount; balance }
}

class SavingAccount(val rate: Double, initialBalance: Double) extends BankAccount(initialBalance) {
	private var balance = initialBalance
	private var transactionCount = 0

	def earnMonthlyInterest = {
		transactionCount = 0
		balance += balance * rate
		balance
	}

	override def deposit(amount: Double) = {
		if(3 > transactionCount) {
			balance = super.deposit(amount)
			transactionCount += 1
		} else {
			println("You can't deposit")
		}

		balance
 	}

	override def withdraw(amount: Double) = {
		if(3 > transactionCount) {
			balance = super.withdraw(amount)
			transactionCount += 1
		} else {
			println("You can't withdraw")
		}

		balance
	}
}

val SA = new SavingAccount(0.20, 15)

println(SA.deposit(10),SA.withdraw(20),SA.deposit(130),SA.withdraw(15),SA.earnMonthlyInterest,SA.deposit(20))