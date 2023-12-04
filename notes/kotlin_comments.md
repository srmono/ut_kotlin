In Kotlin, you can use two types of comments: single-line comments and multi-line comments. Here are examples of both:

### 1. Single-Line Comments:

Single-line comments start with `//` and continue until the end of the line.

```kotlin
// This is a single-line comment
val x = 10 // You can also add comments at the end of a line of code
```

### 2. Multi-Line Comments:

Multi-line comments start with `/*` and end with `*/`. They can span multiple lines.

```kotlin
/*
   This is a multi-line comment.
   It can span multiple lines.
   It is useful for longer explanations.
*/
val y = 20
```

### 3. Documentation Comments:

Documentation comments use the `/** ... */` syntax and are often placed above classes, functions, or properties to generate documentation.

```kotlin
/**
 * This is a documentation comment for a function.
 * It provides information about the function's purpose.
 * @param a The first parameter.
 * @param b The second parameter.
 * @return The sum of a and b.
 */
fun add(a: Int, b: Int): Int {
    return a + b
}
```

### 4. Using Comments for Debugging:

Comments can also be used for temporary debugging information.

```kotlin
val result = calculate() // TODO: Fix this function
```

### 5. Commenting Out Code:

You can use comments to temporarily disable or comment out a piece of code.

```kotlin
/*
val temporarilyDisabled = "This line is commented out"
*/
```

### 6. Inline Comments:

Inline comments can be used to provide brief explanations within a line of code.

```kotlin
val age = 25 // User's age
```

### 7. TODO Comments:

TODO comments are often used to mark areas of code that need attention or improvement.

```kotlin
fun process(data: List<String>) {
    // TODO: Implement data processing logic
}
```

Comments are essential for making your code more readable and maintainable. Use them to explain the purpose of your code, provide context, and leave notes for yourself or other developers who may read your code.