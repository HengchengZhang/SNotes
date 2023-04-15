# Scala Notes

___

*The lectures come
from [Mark Lewis's YouTube Channel](https://www.youtube.com/watch?v=85bHg5AipvU&list=PLLMXbkbDbVt8JLumqKj-3BlHmEXPIfR42&index=1)* (Video 35 - )

### 2D Vector Class

1. When an `object` is created as the same name of a `class`, it is called a companion object.
2. You can still have `main` in it.
3. Overall the `Vector2D` class is more Java style.

### Mutable 2D Vector Class

1. More scala style, but harder to read.

### Scala Naming/Symbolic Names

1. The naming in scala can be completely made of operation symbols like `+ - * / % | & ^(XOR) ! < > = ? $ \ : ~`.
2. Or a normal name followed by `_` + operation symbols.
3. The name need to have some meanings, or it's just a simply bad naming because it could be hard to read.
4. This more flexible naming can make mathematical classes more meaningful.

### Precedence

1. The first character in the method's name determine the precedence.
2. The precedence from high to low looks like
    * Other special characters
    * `* / %`
    * `+ -`
    * `:`(use to join lists)
    * `= !`
    * `< >`
    * `&`
    * `|`
    * All letters
    * Assignment operators (like `+=`)

### Associativity and Unary Operators

1. Everything ends in `:` is right associative.

### Property Assignment Methods

1. If a method is named by `name` + `_` + `=`, then it can be used by dot notation.
2. When scala sees a `+=`, firstly it checks if there is a `+=` method. If there is not, it will read the `+=` as `* = * + *`.

