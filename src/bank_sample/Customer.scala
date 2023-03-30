package bank_sample

class Customer(val firstName: String,
               val lastName: String,
               val id: String,
               private var _address: Address) {

  private var _accounts: List[Account] = Nil

  def addAccount(acc: Account): Unit = _accounts ::= acc

  def removeAccount(id: String): Boolean = {
    val valid_accs = _accounts.filter(_.id == id)
    if (valid_accs == Nil) false
    else {
      val idx = valid_accs.indexWhere(_.showBalance == 0)
      _accounts = _accounts.patch(idx, Nil, 1)
      true
    }
  }

  def accounts = _accounts

  def changeAddress(add: Address): Unit = _address = add

  def address = _address

}

