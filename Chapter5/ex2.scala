class BankAccount {
	private var balanceValue: Double = 0.0
	
	def deposit(amount: Double) {
		balanceValue = balanceValue + amount
	}

	def withdraw(amount: Double) {
		balanceValue = balanceValue - amount
	}

	def balance: Double = balanceValue
}

var bankAccount = new BankAccount()

println(bankAccount.balance)

// will crash
// bankAccount.balanceValue = 123