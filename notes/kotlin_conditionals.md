# Kotlin Conditionals

### 1. Basic `if` Statement:

```kotlin
val x = 10

if (x > 0) {
    println("x is positive")
}
```

Description: In this example, an `if` statement checks if the variable `x` is greater than 0. If the condition is true, it prints "x is positive."

### 2. `if`-`else` Statement:

```kotlin
val number = -5

if (number > 0) {
    println("Number is positive")
} else {
    println("Number is non-positive")
}
```

Description: This example uses an `if`-`else` statement to determine whether the variable `number` is positive or non-positive and prints the corresponding message.

### 3. `if`-`else if`-`else` Chain:

```kotlin
val grade = 85

if (grade >= 90) {
    println("A")
} else if (grade >= 80) {
    println("B")
} else if (grade >= 70) {
    println("C")
} else {
    println("D")
}
```

Description: A series of `if`-`else if`-`else` statements determine the grade based on the value of the variable `grade` and print the corresponding letter grade.

### 4. Using Conditional Expressions:

```kotlin
val x = 10

val result = if (x > 0) "Positive" else "Non-positive"
println(result)
```

Description: This example uses a conditional expression (`?:`) to assign a value to the variable `result` based on whether `x` is positive or non-positive.

### 5. Checking for `null`:

```kotlin
val name: String? = null

val result = if (name != null) {
    "Length of name: ${name.length}"
} else {
    "Name is null"
}

println(result)
```

Description: The `if` statement checks whether the variable `name` is not null. If not null, it prints the length of the name; otherwise, it prints "Name is null."

### 6. `when` Expression:

```kotlin
val dayOfWeek = 3

when (dayOfWeek) {
    1 -> println("Sunday")
    2 -> println("Monday")
    3 -> println("Tuesday")
    4 -> println("Wednesday")
    5 -> println("Thursday")
    6 -> println("Friday")
    7 -> println("Saturday")
    else -> println("Invalid day")
}
```

Description: The `when` expression is used to print the name of the day based on the value of `dayOfWeek`.

### 7. Smart Casts with `is`:

```kotlin
val value: Any = "Hello"

if (value is String) {
    println(value.length) // value is automatically cast to String
} else {
    println("Not a string")
}
```

Description: The `is` keyword is used for type checking, and smart casts automatically cast `value` to a `String` within the `if` block.

### 8. Using `when` with Ranges:

```kotlin
val score = 75

when (score) {
    in 90..100 -> println("A")
    in 80 until 90 -> println("B")
    in 70 until 80 -> println("C")
    else -> println("D")
}
```

Description: The `when` expression is used with ranges to determine the grade based on the value of the `score` variable.

These examples demonstrate various ways to use conditionals in Kotlin, from basic `if` statements to more complex scenarios using `when` expressions and conditional expressions.