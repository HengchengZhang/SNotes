[//]: # (<span style = "font-family: dejavu">)

[//]: # (# Scala Notes)

[//]: # (</span>)
# Scala Notes
___

*The lectures come from [Mark Lewis's YouTube Channel](https://www.youtube.com/watch?v=85bHg5AipvU&list=PLLMXbkbDbVt8JLumqKj-3BlHmEXPIfR42&index=1)*

### Getting started

1. The top level can only have one of the three things:
    * object
    * class
    * trait
2. It would be better to match the object name with filename.
3. When something returns no information, use unit. Java uses void and returns actually nothing.

### Variables and Types

1. There are two kinds of variables in scala:
   * val
   * var
2. The difference between val and var the ability to make assignments. val is a finial assignment and cant be reassigned with other values while var can.
3. THerefore val is preferred to simplify the logic.
4. A variable can just be simply declared or defined type.
5. Some basic types in scala: Int, Double, Char, Sting, Boolean, Unit.
6. Tuple starts at one instead of zero.

### String Interpolation

### Statements and Expressions

1. Some binary oprations can use inline commands
   ```scala
   val a:Int = 1
   var b:Int = 2
   // These are equivalent expressions
   a.min(b)
   a min b
   ```
2. In this case, operations with letters("min") have lower precesion than other operations("+").
3. In Java we need .equal() method to compare equivalence and == only compares identity, but == in scala is same as .equal().

### Lambda Expressions

1. We use symbol "=>" reads rocket.

### If and While

1. If "if" is used in an expression, the result can lead to the variable become type "any", which needs to be avoided.

### for Loops/Comprehensions

1. "<-" reads in.
2. "to" is inclusive at the highend, "until" is exclusive at the highend.
3. Conditions can be added in for loops.

### Match Expresstion

1. Just like Haskell

### try/catch

### Declarations and Scope

### Libraries and Standard Input

### Arrays and Lists

1. Array is mutable and List is not. This means the items in Arrays can be modified(not reassigned) and List is final.
2. When you add a new item to a List, the original List wont change, instead you will get a new List with the item added.
   ```scala
   List[Char] = List(a, b, c)
   Array[Int] = Array(1, 2, 3)
   ```

### fill and tabulate

1. The second argument in fill is the argument you want it to fits.
   ```scala
   List.fill(100)(math.random)
   List.fill(5)(io.StdIn.readLine)
   ```
2. We can use tabulate if we need an Array with each value equals to its index.
   ```scala
   Array.tabulate(10)(i => i * i)
   // This will return an array with 20 zeros
   new Array[Int](20)
   ```
3. The second method is not recommended because when it has type String, this will return null and null will lead to errors.

### Range

1. Some examples:
   ```scala
   1 to 10
   1.to(10)
   'a' to 'z'
   // Only return the odd values
   1 to 10 by 2
   // This is not well defined
   1.0 to 10.0
   // This is cool
   1.0 to 10.0 by 1.0
   // Back counting is also cool
   10 to 1 by -1
   ```
### Basic Sequence Methods

1. The following methods work on Lists, since List is immutable, changing itself will make it mutable.
   ```scala
   val a = Array(6, 9, 1, 5, 7, 2)
   a.drop(2)
   a.dropRight(2)
   a.head
   a.tail
   a.last
   a.length
   a(a.length - 1)
   // Split the Array into [,:3] + [3:,]
   a.splitAt(3)
   // Take the first n elements
   a.take(3)
   a.takeRight(2)
   // The second argument is exclusive
   a.slice(2, 5)
   // Replace the next k elements from index i with j for .patch(i, j, k)
   a.patch(2, Array(65, 456), 3)
   // This return the elements that are not appeared in the input list, will not remove duplicates
   a.diff(Array(5, 3, 1))
   // This remove all the duplicate and leave the first one
   a.distinct
   // Intersection and Union(returns an Array)
   a.intersect(List(1, 2, 3))
   a.union(Array(1, 2, 3, 4))
   // toString methods
   a.mkString
   a.mkString(", ")
   a.mkString("[", ", ", "]")
   // Zip methods
   a.zip('a' to 'z')
   a.zipWithIndex
   ```

### Higher-Order Sequence Methods

1. When a function takes a function as input and returns another one.
   ```scala
   val a = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
   a.foreach(println)
   // Similar map as haskell but returns a new collection type
   a.map(_ * 2)
   // Similar filter as haskell
   a.filter(_ < 5)
   // Count even values
   a.count(_ % 2 == 0)
   // If there exists a valid element
   a.exists(_ > 10)
   // If all elements are valid
   a.forall(_ < 10)
   // This can return a Monad? and therefore the result can be wried if the element is not present
   a.find(_ % 4 == 0)
   // This return two Arrays where one is valid and the other is not
   a.partition(_ < 5)
   // Reduce behaves like fold in Haskell
   a.reduce(_ + _)
   // minBy
   val values = Array("this", "is", "dummy", "codes")
   values.minBy(_.length)
   ```
2. Just scroll through the APIs.

### Strings as Collections

1. Of course String can usually(always?) be treated as a collection of Chars.
2. String can also be splitted by RegEx(Yeah that's what we want).

### Lists, Recursion and Patterns

1. Nil is used as empty List.
2. x:xs in Haskell can be expressed as h::t in Scala.

### Option

1. Recall that Option is the return type of the .find method
   ```scala
   val a = Array(6, 1, 7, 2, 9, 4)
   val res0 = a.find(_ < 3)
   // Returns Option[Int] = Some(1)
   val res1 = a.find(_ > 10)
   // Returns Option[Int] = None
   ```
2. The .get method will return error if there is nothing to return.
3. Therefore, we can do some pattern matching like Haskell(Here it is)
   ```scala
   val res = res0 match {
   case Some(i) => s"$i"
   case None => ""
   }
   ```
4. There's other methods to solve this
   ```scala
   // Return the default value(0) if it returns nothing
   res1.getOrElse(0)
   // map will not return error for None
   res0.map(_ * 2)
   // Returns Some(2)
   res1.map(_ * 2)
   // Returns None
   ```
   
### Text Files

1. The Source type returns a cantor collection, which is called an Iterator. Unlike Array or List, an Iterator is consumed when it is used.
2. A BufferedSource is an iterator of Chars. Use .getLines() in this case.
3. Remember to close the file after using it.
4. Before closing the file, all actions need to be finished, otherwise there will be an error.

### Named and Default Arguments

### Currying and Pass-by-Name

1. Currying is the ability to apply arguments one at a time.
2. Didn't quite understand pass-by-name currently.

### Object-Orientation and Classes

### Instantiating Objects and Arguments as Members

1. To visit attributes outside a Class, they need to be set as variables.

