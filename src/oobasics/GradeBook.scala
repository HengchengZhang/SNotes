package oobasics

object GradeBook {
  def main(args: Array[String]): Unit = {
    val students = List(new Student("John", "Smith"), new Student("Jane", "Smith"))
    for (s <- students) println(s)
  }

}
