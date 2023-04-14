package oodetails

class MutableVector2D(private var _x: Double,
                      private var _y: Double) {

  def x = _x

  def y = _y

  def setX(newX: Double): Unit = (_x = newX)

  def setY(newY: Double): Unit = (_y = newY)

  def plus(vec: MutableVector2D): MutableVector2D = {
    _x += vec.x
    _y += vec.y
    this
  }

  def minus(vec: MutableVector2D): MutableVector2D = {
    _x -= vec.x
    _y -= vec.y
    this
  }

  def scale(c: Double): MutableVector2D = {
    _x *= c
    _y *= c
    this
  }

  def magnitude(): Double = (math.sqrt(x * x + y * y))

}

object MutableVector2D {
  def main(args: Array[String]): Unit = {

  }
}
