package basics

import scala.io.StdIn._

object Libraries {
  def main(args: Array[String]): Unit = {
    println("What is your name?")
    val name = readLine()
    println("How old are you?")
    val age = readInt()

    val lst = buildList()
    println(myConcat(lst))


  }

  def buildList(): List[String] = {
    val input = readLine()
    if (input == "quit") Nil
    else input :: buildList()
  }

  def myConcat(words: List[String]): String = words match {
    case Nil => ""
    case x :: xs => x + " " + myConcat(xs)
  }

}