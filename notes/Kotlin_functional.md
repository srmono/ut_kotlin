


# Higher-Order Functions

Higher-Order Functions (HOFs) in Kotlin are functions that can take other functions as parameters or return functions. They provide a way to abstract over actions, allowing for more reusable and flexible code.

## Example:

```kotlin
// Higher-Order Function
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Example usage:
val additionResult = calculate(5, 3) { x, y -> x + y }
val multiplicationResult = calculate(5, 3) { x, y -> x * y }

println("Addition Result: $additionResult")
println("Multiplication Result: $multiplicationResult")
```

In this example, the `calculate` function takes two numbers and a function as parameters. The provided lambda functions define the addition and multiplication operations.

The output will be:

```
Addition Result: 8
Multiplication Result: 15
```

This demonstrates how higher-order functions allow us to pass behavior as a parameter.

---

# Lambda Functions

Lambda functions, also known as anonymous functions, are concise ways to define functions without explicitly naming them. They are often used as parameters for higher-order functions.

## Example:

```kotlin
// Regular function
val add: (Int, Int) -> Int = { x, y -> x + y }

// Lambda function as a parameter
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Example usage:
val result = calculate(5, 3, add)

println("Result of addition: $result")
```

In this example, the lambda function `{ x, y -> x + y }` is assigned to the variable `add`, which is then passed as a parameter to the `calculate` function. The lambda function defines the addition operation.

The output will be:

```
Result of addition: 8
```

This illustrates how lambda functions provide a concise syntax for defining functions on the fly.

---

# Extension Functions and Properties

Extension functions and properties allow you to add new functions or properties to existing classes without modifying their source code. They are useful for extending the functionality of classes from external libraries or system classes.

## Example:

```kotlin
// Extension function for String class
fun String.addExclamation(): String {
    return "$this!"
}

// Extension property for Int class
val Int.isEven: Boolean
    get() = this % 2 == 0

// Example usage:
val greeting = "Hello, World".addExclamation()
val isTenEven = 10.isEven

println("Greeting: $greeting")
println("Is 10 even? $isTenEven")
```

In this example, we define an extension function `addExclamation` for the `String` class and an extension property `isEven` for the `Int` class. These extensions are then used on instances of those classes.

The output will be:

```
Greeting: Hello, World!
Is 10 even? true
```

This showcases how extension functions and properties enhance the capabilities of existing classes.
```