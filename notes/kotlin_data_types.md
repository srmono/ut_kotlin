# Kotlin data types:  basic types and complex types, along with examples:

### Basic Types:

```

| Data Type         | Description                                   | Example                             |
|-------------------|-----------------------------------------------|-------------------------------------|
| `Int`             | 32-bit signed integer                         | `val age: Int = 25`                 |
| `Long`            | 64-bit signed integer                         | `val distance: Long = 10000000000L` |
| `Short`           | 16-bit signed integer                         | `val code: Short = 32767`           |
| `Byte`            | 8-bit signed integer                          | `val flag: Byte = 1`               |
| `Double`          | 64-bit double-precision floating-point       | `val pi: Double = 3.14`            |
| `Float`           | 32-bit single-precision floating-point       | `val temperature: Float = 98.6f`   |
| `Char`            | 16-bit Unicode character                     | `val initial: Char = 'A'`          |
| `Boolean`         | Represents true or false                      | `val isReady: Boolean = true`      |
| `String`          | Sequence of characters                        | `val greeting: String = "Hello"`   |
```

### Complex Types:

```
| Data Type         | Description                                   | Example                             |
|-------------------|-----------------------------------------------|-------------------------------------|
| `Array`           | Fixed-size collection of elements             | `val numbers: Array<Int> = arrayOf(1, 2, 3)` |
| `List`            | Immutable ordered collection                  | `val names: List<String> = listOf("Alice", "Bob")` |
| `MutableList`     | Mutable ordered collection                    | `val scores: MutableList<Int> = mutableListOf(90, 85, 92)` |
| `Set`             | Immutable unordered collection                | `val uniqueNumbers: Set<Int> = setOf(1, 2, 3)` |
| `Map`             | Immutable key-value pairs                     | `val ages: Map<String, Int> = mapOf("Alice" to 30, "Bob" to 25)` |
| `MutableMap`      | Mutable key-value pairs                       | `val scores: MutableMap<String, Int> = mutableMapOf("Alice" to 95, "Bob" to 88)` |
| `Any`             | The root type of the Kotlin type hierarchy    | `val value: Any = 42`              |
| `Nothing`         | Represents a value that never exists          | `fun throwError(): Nothing { throw Exception("Error!") }` |
| `Unit`            | Equivalent to `void` in other languages       | `fun printMessage(): Unit { println("Hello!") }` |
```

These tables separate basic data types (such as numbers, characters, and booleans) from more complex data types (such as arrays, lists, sets, and maps). Keep in mind that complex types can hold multiple values and offer more advanced data structures and behaviors.