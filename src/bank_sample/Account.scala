package bank_sample

class Account(val customer: Customer,
              val id: String) {

  private var _balance: Int = 0

  customer.addAccount(this)

  def deposit(amount: Int): Unit = if (amount >= 0) _balance += amount

  def withdraw(amount: Int): Unit = if (_balance - amount >= 0) _balance -= amount

  def showBalance: Int = _balance

  override def toString: String = s"Dear customer ${customer.firstName} ${customer.lastName}, account id: $id, has a balance of $_balance."

}
