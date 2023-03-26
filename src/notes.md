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
4. 