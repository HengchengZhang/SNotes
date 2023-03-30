package bank_sample

class Bank {

  private var _customers: List[Customer] = Nil
  private var _accounts: List[Account] = Nil
  private var nextCustomerNum: Int = 0
  private var nextAccountNum: Int = 0

  def addCustomer(firstName: String,
                  lastName: String,
                  address: Address): Unit = {
    _customers ::= new Customer(firstName, lastName, nextCustomerNum.toString, address)
    nextCustomerNum += 1
  }

  def openAccount(customer: Customer): Account = {
    val acc = new Account(customer, nextAccountNum.toString)
    _accounts ::= acc
    acc
  }

  def closeAccount(acc: Account): Unit = {
    if (_accounts.contains(acc) && (acc.showBalance == 0)) acc.customer.removeAccount(acc.id)
  }

  def findCustomer(firstName: String, lastName: String): Option[Customer] = {
    _customers.find(c => c.firstName == firstName && c.lastName == lastName)
  }

  def findCustomer(id: String): Option[Customer] = {
    _customers.find(c => c.id == id)
  }

  def findAccount(id: String): Option[Account] = {
    _accounts.find(a => a.id == id)
  }

}
