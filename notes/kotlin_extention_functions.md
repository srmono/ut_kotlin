In Kotlin, extension functions allow you to add new functions to existing classes without modifying their source code. They are powerful tools for enhancing the functionality of classes, including standard library classes or your own types. Here's a detailed explanation with an example:

### Declaration Syntax:

An extension function is declared using the following syntax:

```kotlin
fun receiverType.functionName(parameters): ReturnType {
    // Function implementation
}
```

- `receiverType`: The type being extended.
- `functionName`: The name of the new function.
- `parameters`: The function parameters.
- `ReturnType`: The return type of the function.

### Example:

Let's create an extension function for the `String` class to capitalize the first letter of each word in a string:

```kotlin
// Extension function for String
fun String.capitalizeWords(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main() {
    val originalString = "hello world"
    val capitalizedString = originalString.capitalizeWords()

    println("Original: $originalString")
    println("Capitalized: $capitalizedString")
}
```

### Explanation:

- We define an extension function `capitalizeWords` for the `String` class.
- Inside the function, `this` refers to the instance of `String` on which the function is called.
- The function splits the string into words, capitalizes each word, and then joins them back into a string.

### Output:

```
Original: hello world
Capitalized: Hello World
```

### Key Points:

1. **Receiver Type:**
   - The type being extended is known as the "receiver type" (e.g., `String` in this example).

2. **Access to Receiver Object:**
   - Inside the extension function, you can access the properties and methods of the receiver object using `this`.

3. **Importance of 'this':**
   - The use of `this` is optional, but when needed, it refers to the receiver object, making it clear that you are working with an instance of the receiver type.

4. **Extension functions are resolved statically:**
   - Extension functions are resolved at compile-time based on the declared type of the variable, not at runtime based on the actual type of the object.

5. **Scope of Extension Functions:**
   - Extension functions need to be in scope to be used. You can define them in the same file or import them where needed.

Extension functions are a powerful feature in Kotlin, enabling you to enhance the functionality of existing classes in a clean and concise manner. They contribute to Kotlin's philosophy of expressive and concise code.