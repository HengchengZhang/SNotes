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
    * tree
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
   ```
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
2. "to" means leq, "until" means lt.
3. Conditions can be added in for loops.

### Match Expresstion

1. Just like Haskell

### try/catch

### Declarations and Scope

### Libraries and Standard Input

### Arrays and Lists

1. Array is mutable and List is not. This means the items in Arrays can be modified(not reassigned) and List is final.
2. When you add a new item to a List, the original List wont change, instead you will get a new List with the item added.
   ```
   List[Char] = List(a, b, c)
   Array[Int] = Array(1, 2, 3)
   ```

### fill and tabulate

1. The second argument in fill is the argument you want it to fits.
   ```
   List.fill(100)(math.random)
   List.fill(5)(io.StdIn.readLine)
   ```
2. We can use tabulate if we need an Array with each value equals to its index.
   ```
   Array.tabulate(10)(i => i * i)
   // This will return an array with 20 zeros
   new Array[Int](20)
   ```
3. The second method is not recommended because when it has type String, this will return null and null will lead to errors.

