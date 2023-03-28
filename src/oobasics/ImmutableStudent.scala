package oobasics

class ImmutableStudent(val firstName: String,
                       val lastName: String,
                       val quizzes: List[Int] = Nil,
                       val assignments: List[Int] = Nil,
                       val tests: List[Int] = Nil) {

  private def findMean(results: List[Int]): Double = {
    results match {
      case Nil => 0.0
      case _ => results.sum.toDouble / results.length
    }
  }

  def addQuiz(grade: Int): ImmutableStudent = new ImmutableStudent(firstName,
    lastName,
    grade :: quizzes,
    assignments,
    tests)

  def quizMean: Double = findMean(quizzes)

  def assgnMean: Double = findMean(assignments)

  def testMean: Double = findMean(tests)

  def average: Double = 0.1 * quizMean + 0.5 * assgnMean + 0.4 * testMean
}
