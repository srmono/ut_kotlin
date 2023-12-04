### Kotlin Exceptions

In Kotlin, exceptions are used to handle unexpected or exceptional situations that can occur during the execution of a program. The basic syntax for handling exceptions involves the use of `try`, `catch`, `finally`, and `throw` statements.

#### 1. **Throwing Exceptions (`throw` statement):**

Use the `throw` statement to throw a specific exception when a certain condition is met.

```kotlin
fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw IllegalArgumentException("Cannot divide by zero")
    }
    return a / b
}
```

#### 2. **Catching Exceptions (`try`-`catch` block):**

Use the `try`-`catch` block to handle exceptions. The `catch` block specifies the type of exception to catch.

```kotlin
fun main() {
    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
```

#### 3. **Finally Block (`finally`):**

The `finally` block contains code that is guaranteed to execute, whether an exception is thrown or not.

```kotlin
fun main() {
    try {
        val result = divide(10, 2)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } finally {
        println("Finally block executed")
    }
}
```

#### 4. **Multiple Catch Blocks:**

You can have multiple `catch` blocks to handle different types of exceptions.

```kotlin
fun main() {
    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Illegal Argument: ${e.message}")
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception: ${e.message}")
    }
}
```

#### 5. **Custom Exception Classes:**

You can create custom exception classes by extending the `Exception` class.

```kotlin
class CustomException(message: String) : Exception(message)

fun process(input: String) {
    if (input.isEmpty()) {
        throw CustomException("Input cannot be empty")
    }
    // Process the input
}
```

#### 6. **Try Expression:**

Kotlin also provides a `try` expression, which allows you to use the result of the `try` block in the `catch` or `finally` block.

```kotlin
val result: Int = try {
    divide(10, 2)
} catch (e: IllegalArgumentException) {
    -1
}
```

These examples showcase the basic concepts of handling exceptions in Kotlin, including throwing exceptions, catching them, using the `finally` block, handling multiple exceptions, creating custom exceptions, and using the `try` expression.


--- 


In Kotlin, exceptions are categorized into two main types: checked exceptions and unchecked exceptions. Let's briefly explain these concepts:

### Checked Exceptions:

Checked exceptions are exceptions that the compiler forces you to handle explicitly. They are subclasses of the `Exception` class (or a subclass of `Exception`). If a function throws a checked exception, you must either catch the exception using a `try`-`catch` block or declare that your function can throw the exception using the `throws` clause.

#### Example of a Checked Exception:

```kotlin
fun readFile(fileName: String): String {
    return try {
        // Code to read a file
        // ...
        "File content"
    } catch (e: IOException) {
        // Handle the IOException
        "Error reading file"
    }
}
```

In this example, `IOException` is a checked exception. The `readFile` function either catches the exception or declares that it can throw the exception.

### Unchecked Exceptions:

Unchecked exceptions, also known as runtime exceptions, are exceptions that don't need to be declared explicitly in the function signature, and the compiler doesn't force you to catch them. They are subclasses of `RuntimeException` or a subclass of `RuntimeException`.

#### Example of an Unchecked Exception:

```kotlin
fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw ArithmeticException("Cannot divide by zero")
    }
    return a / b
}
```

In this example, `ArithmeticException` is an unchecked exception. The compiler does not enforce catching or declaring it in the function signature.

### Handling Checked Exceptions vs. Unchecked Exceptions:

- **Checked Exceptions:**
  - Must be caught or declared using `throws`.
  - Include exceptions derived from `Exception` (excluding `RuntimeException`).

- **Unchecked Exceptions:**
  - Can be caught, but catching is optional.
  - Include exceptions derived from `RuntimeException`.

### Note:

In Kotlin, the concept of checked exceptions is somewhat relaxed compared to languages like Java. Kotlin doesn't have a `throws` clause, and it allows you to catch checked exceptions or propagate them without explicit declaration.

Understanding the difference between checked and unchecked exceptions is crucial for writing robust and error-tolerant code in Kotlin.

---

## Checked and Un Checked Exceptions in Kotlin

In Kotlin, there is no concept of checked exceptions as found in languages like Java. Unlike Java, Kotlin does not enforce the handling or declaration of checked exceptions in function signatures using the `throws` clause.

In Java, methods that can potentially throw checked exceptions must declare those exceptions in their method signature, and calling code must either catch the exceptions or propagate them using the `throws` clause. However, in Kotlin, this requirement has been relaxed.

Kotlin treats all exceptions, whether checked or unchecked, in a similar manner. You are not obligated to catch or declare exceptions explicitly in the function signature. This is one of the ways in which Kotlin simplifies exception handling and provides more concise and readable code.

Here's an example in Kotlin:

```kotlin
fun readFile(fileName: String): String {
    return try {
        // Code to read a file
        // ...
        "File content"
    } catch (e: IOException) {
        // Handle the IOException
        "Error reading file"
    }
}
```

In this example, the `IOException` is a checked exception, but there is no need to declare it in the function signature. You can catch it using a `try`-`catch` block, and the compiler won't complain about unhandled exceptions.

This design choice in Kotlin is intentional and aligns with the language's goal of improving developer productivity and reducing boilerplate code. However, it's essential to be aware of the exceptions that a function can throw by checking its documentation or source code.