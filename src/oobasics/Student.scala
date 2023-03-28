package oobasics

class Student(val firstName: String,
              val lastName: String,
              private var quizzes: List[Int] = Nil,
              private var assignments: List[Int] = Nil,
              private var tests: List[Int] = Nil) {

  private def findMean(results: List[Int]): Double = {
    results match {
      case Nil => 0.0
      case _ => results.sum.toDouble / results.length
    }
  }

  def addQuiz(grade: Int): Unit = quizzes ::= grade

  def quizMean: Double = findMean(quizzes)

  def assgnMean: Double = findMean(assignments)

  def testMean: Double = findMean(tests)

  def average: Double = 0.1 * quizMean + 0.5 * assgnMean + 0.4 * testMean

  override def toString: String = s"This is $firstName $lastName, the average score is ${average}"

}
