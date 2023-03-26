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