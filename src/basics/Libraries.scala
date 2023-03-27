package basics

import scala.io.StdIn._
import scala.io.Source
import java.io.PrintWriter

object Libraries {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("/Users/x_x/IdeaProjects/SNotes/matrix.txt")
    val lines = source.getLines()
    val matrix = lines.map(_.split(" ").map((_.toDouble))).toArray
    source.close()

    val pw = new PrintWriter("rowSums.txt")
    matrix.foreach(row => pw.println(row.sum))
    pw.close()

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