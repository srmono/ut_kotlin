In Kotlin, there are several ways to implement loops, including `for`, `while`, and `do-while` loops. Here are examples of each type:

### 1. **For Loop:**

#### a. Iterating Over a Range:

```kotlin
for (i in 1..5) {
    println("Value of i: $i")
}
```

#### b. Iterating Over a Collection:

```kotlin
val fruits = listOf("Apple", "Banana", "Orange")

for (fruit in fruits) {
    println("Fruit: $fruit")
}
```

### 2. **While Loop:**

#### a. Simple While Loop:

```kotlin
var count = 0

while (count < 5) {
    println("Count: $count")
    count++
}
```

#### b. While Loop with Condition at the End:

```kotlin
var number = 1

while (number <= 10) {
    println("Number: $number")
    number++
}
```

### 3. **Do-While Loop:**

#### a. Do-While Loop:

```kotlin
var x = 5

do {
    println("Value of x: $x")
    x--
} while (x > 0)
```

### 4. **Loop Control Statements:**

#### a. `break` Statement:

```kotlin
for (i in 1..10) {
    if (i == 5) {
        break
    }
    println("Value: $i")
}
```

#### b. `continue` Statement:

```kotlin
for (i in 1..10) {
    if (i % 2 == 0) {
        continue
    }
    println("Odd Value: $i")
}
```

### 5. **Looping Through Maps:**

```kotlin
val ages = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 22)

for ((name, age) in ages) {
    println("$name is $age years old")
}
```

These examples illustrate different types of loops in Kotlin, including `for` loops for iterating over ranges and collections, `while` loops for executing code based on a condition, `do-while` loops for executing code at least once, and the use of loop control statements (`break` and `continue`). 