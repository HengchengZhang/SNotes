package basics

/**
 * Created HelloWorld object in scala
 */
object HelloWorld {

  val value: Int = 123
  val name = "Obi-Wan"
  var age = 23
  age += 1
  // String, Int, Char, Boolean, Double, Unit
  val t = (1, 1.2, "123")
  // To assign value in t to other variables
  val (a, b, c) = t
  // Another way is:
  println(t._1)

  val message = f"${name} is ${age} years old."

  name == "Obi-Wan" * 5

  // This is a function
  val square = (x: Double) => x * x
  val square2: Double => Double = x => x * x

  // This is a method of object HelloWorld
  //  def square(x: Double): Double = x * x

  val twice: Double => Double = _ * 2
  val lt: (Double, Double) => Boolean = _ < _

  // Simple loop
  var i = 0
  while (i < 5) {
    i += 1
  }

  // Scala like condition
  val response = if (age < 18) {
    "Banned!"
  } else {
    "Welcome!"
  }

  println(if (age < 18) "Banned!" else "Welcome!")

  val stuff = for {
    i <- 0 until 5
    if i % 3 == 0
    j <- 'a' to 'c'
    sqr = i * i
  } yield {
    // -> seems like .append()
    i -> j -> sqr
  }
  println(stuff)

  val fizzbuzz = for {i <- 1 to 20}
    yield {
      (i % 3, i % 5) match {
//        case (0, 0) if i < 5 => "fizzbuzz"
        case (0, 0) => "fizzbuzz"
        case (0, _) => "fizz"
        case (_, 0) => "buzz"
        case _ => i.toString
      }
    }

  val str = "123"
  val num = try {
    str.toInt
  } catch {
    case ex: NumberFormatException => 0
      println(ex)
  }
  println(num)

  List.fill(100)(math.random())


  /**
   * The main function that prints Hello World
   *
   * @param args the arguments to this application
   */
  def main(args: Array[String]): Unit = {
    println("Hello World")
    println(message)
  }
}