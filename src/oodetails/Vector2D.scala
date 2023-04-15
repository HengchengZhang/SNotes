package oodetails

class Vector2D(val x: Double,
               val y: Double) {
  /**
   * Vector addition
   */
  def plus(vec: Vector2D) = new Vector2D(x + vec.x, y + vec.y)

  def subtraction(vec: Vector2D) = new Vector2D(x - vec.x, y - vec.y)

  def scale(c: Double) = new Vector2D(c * x, c * y)

  def magnitude(): Double = math.sqrt(x * x + y * y)

  private def unary_-(): Vector2D = new Vector2D(-x, -y)

  override def toString: String = s"($x, $y)"

}

object Vector2D {
  def main(args: Array[String]): Unit = {
    val v1 = new Vector2D(3, 4)
    val v2 = new Vector2D(1, 1)
    println(v1.plus(v2))
    println(v1.subtraction(v2))
    println(v1.scale(0.5))
    println(v2.magnitude())
    println(-v2)
  }
}
