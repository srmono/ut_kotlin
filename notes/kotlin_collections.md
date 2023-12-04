Kotlin provides a rich set of collection types in its standard library, including lists, sets, maps, and more. Here are examples of commonly used collection types in Kotlin:

### 1. **Lists:**

#### a. Immutable List:

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
println("Numbers: $numbers")
```

#### b. Mutable List:

```kotlin
val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)
mutableNumbers.add(6)
mutableNumbers.removeAt(2)
println("Mutable Numbers: $mutableNumbers")
```

### 2. **Sets:**

#### a. Immutable Set:

```kotlin
val uniqueNumbers = setOf(1, 2, 3, 4, 5, 5)
println("Unique Numbers: $uniqueNumbers")
```

#### b. Mutable Set:

```kotlin
val mutableUniqueNumbers = mutableSetOf(1, 2, 3, 4, 5)
mutableUniqueNumbers.add(6)
mutableUniqueNumbers.remove(3)
println("Mutable Unique Numbers: $mutableUniqueNumbers")
```

### 3. **Maps:**

#### a. Immutable Map:

```kotlin
val ages = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 22)
println("Ages: $ages")
```

#### b. Mutable Map:

```kotlin
val mutableAges = mutableMapOf("Alice" to 25, "Bob" to 30, "Charlie" to 22)
mutableAges["David"] = 28
mutableAges.remove("Bob")
println("Mutable Ages: $mutableAges")
```

### 4. **Arrays:**

```kotlin
val array = arrayOf(1, 2, 3, 4, 5)
println("Array: ${array.joinToString()}")
```

### 5. **Filtering and Mapping:**

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

// Filtering
val evenNumbers = numbers.filter { it % 2 == 0 }

// Mapping
val squaredNumbers = numbers.map { it * it }

println("Even Numbers: $evenNumbers")
println("Squared Numbers: $squaredNumbers")
```

### 6. **Combining Collections:**

```kotlin
val list1 = listOf(1, 2, 3)
val list2 = listOf(4, 5, 6)

val combinedList = list1 + list2
println("Combined List: $combinedList")
```

### 7. **Grouping:**

```kotlin
data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Alice", 25),
    Person("Bob", 30),
    Person("Charlie", 22),
    Person("Alice", 28)
)

val groupedByAge = people.groupBy { it.age }
println("Grouped by Age: $groupedByAge")
```

These examples demonstrate the usage of various collection types in Kotlin, including lists, sets, maps, arrays, and common operations like filtering, mapping, combining, and grouping. Collections in Kotlin provide concise and expressive ways to work with data in your programs.

--- 

Operations on different collection types in Kotlin:

### 1. Lists:

#### a. Create (Add Elements):

```kotlin
val numbers = mutableListOf(1, 2, 3, 4, 5)

// Add element at the end
numbers.add(6)

// Add element at a specific index
numbers.add(2, 10)

println("Numbers after adding elements: $numbers")
```

#### b. Read (Access Elements):

```kotlin
val firstElement = numbers[0]
val lastElement = numbers[numbers.size - 1]

println("First Element: $firstElement")
println("Last Element: $lastElement")
```

#### c. Update (Modify Elements):

```kotlin
numbers[3] = 99
println("Numbers after updating: $numbers")
```

#### d. Delete (Remove Elements):

```kotlin
// Remove element at a specific index
numbers.removeAt(2)

// Remove a specific element
numbers.remove(4)

println("Numbers after removal: $numbers")
```

### 2. Sets:

#### a. Create (Add Elements):

```kotlin
val uniqueNumbers = mutableSetOf(1, 2, 3, 4, 5)

// Add elements
uniqueNumbers.add(6)
uniqueNumbers.addAll(setOf(7, 8))

println("Unique Numbers after adding elements: $uniqueNumbers")
```

#### b. Read (Access Elements):

```kotlin
val containsThree = uniqueNumbers.contains(3)
println("Set contains 3: $containsThree")
```

#### c. Update (Modify Elements):

```kotlin
// No direct method to modify elements in a set, as elements are unique
// If needed, remove and add the updated element
uniqueNumbers.remove(3)
uniqueNumbers.add(99)

println("Unique Numbers after updating: $uniqueNumbers")
```

#### d. Delete (Remove Elements):

```kotlin
uniqueNumbers.remove(4)
println("Unique Numbers after removal: $uniqueNumbers")
```

### 3. Maps:

#### a. Create (Add Elements):

```kotlin
val ages = mutableMapOf("Alice" to 25, "Bob" to 30, "Charlie" to 22)

// Add a new entry
ages["David"] = 28

println("Ages after adding an entry: $ages")
```

#### b. Read (Access Elements):

```kotlin
val ageOfBob = ages["Bob"]
println("Age of Bob: $ageOfBob")
```

#### c. Update (Modify Elements):

```kotlin
// Update the age of Alice
ages["Alice"] = 26

println("Ages after updating: $ages")
```

#### d. Delete (Remove Elements):

```kotlin
// Remove an entry
ages.remove("Charlie")

println("Ages after removal: $ages")
```

### 4. Arrays:

#### a. Create (Declare and Initialize):

```kotlin
val array = arrayOf(1, 2, 3, 4, 5)

println("Array: ${array.joinToString()}")
```

#### b. Read (Access Elements):

```kotlin
val firstElement = array[0]
println("First Element: $firstElement")
```

#### c. Update (Modify Elements):

```kotlin
array[3] = 99
println("Array after updating: ${array.joinToString()}")
```

#### d. Delete (Remove Elements):

```kotlin
// Arrays have fixed size, so you can't directly remove elements
// You can create a new array without the element to "remove" it
val newArray = array.filter { it != 3 }
println("Array after removal: ${newArray.joinToString()}")
```

These examples demonstrate CRUD operations on various collection types in Kotlin, including lists, sets, maps, and arrays. Understanding these operations is crucial for working with collections effectively in Kotlin.