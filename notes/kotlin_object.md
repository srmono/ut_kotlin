Explore the `object` keyword and `companion object` in Kotlin


# Object Keyword and Companion Object in Kotlin

In Kotlin, the `object` keyword is used to define a singleton, a class that has only one instance. Additionally, the `companion object` is a special type of object within a class that allows for the creation of static members or methods.

## `object` Keyword

The `object` keyword is used to create a singleton object, meaning that there is only one instance of the object in the entire application. It can be used to encapsulate related methods or properties without the need for a full class.

### Example:

```kotlin
object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}

fun main() {
    Logger.log("Hello, Kotlin!")
}
```

In this example, the `Logger` object is a singleton that encapsulates a logging method. The `log` method can be accessed directly on the `Logger` object.

## `companion object`

A `companion object` is a way to define static members or methods within a class. It is associated with the class itself rather than an instance of the class, similar to static members in other programming languages.

### Example:

```kotlin
class MathUtils {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }

        const val PI = 3.14159
    }
}

fun main() {
    val result = MathUtils.add(3, 5)
    println("Result of addition: $result")

    println("Value of PI: ${MathUtils.PI}")
}
```

In this example, the `MathUtils` class has a `companion object` containing the `add` method and a constant `PI`. These can be accessed without creating an instance of the `MathUtils` class.

The output will be:

```
Result of addition: 8
Value of PI: 3.14159
```

The `companion object` allows for the organization of related functionalities within a class without the need for an instance.

---

Both the `object` keyword and `companion object` contribute to Kotlin's expressiveness and conciseness by providing alternatives to traditional class-based structures. They are particularly useful when defining utility classes, creating singletons, or grouping related functions and properties.