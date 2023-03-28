package oobasics

class Student(val firstName: String,
              val lastName: String,
              private var _quizzes: List[Int] = Nil,
              private var _assignments: List[Int] = Nil,
              private var _tests: List[Int] = Nil) {

  private def findMean(results: List[Int]): Double = {
    results match {
      case Nil => 0.0
      case _ => results.sum.toDouble / results.length
    }
  }

  private def validGrade(grade: Int): Boolean = grade >= -20 && grade <= 120

  def addQuiz(grade: Int): Boolean = {
    if (validGrade(grade)) {
      _quizzes ::= grade
      true
    } else false
  }

  def quizMean: Double = findMean(_quizzes)

  def assgnMean: Double = findMean(_assignments)

  def testMean: Double = findMean(_tests)

  def average: Double = 0.1 * quizMean + 0.5 * assgnMean + 0.4 * testMean

  def quizzes = _quizzes

  def assignments = _assignments

  def tests = _tests

  override def toString: String = s"This is $firstName $lastName, the average score is ${average}"

}
