# Kotlin Arrays

### Basics of Kotlin Arrays:

#### 1. **Array Initialization:**
   - Arrays can be initialized using the `arrayOf` function.

   ```kotlin
   // Initializing an array of integers
   val numbers = arrayOf(1, 2, 3, 4, 5)
   ```

#### 2. **Accessing Array Elements:**
   - Array elements can be accessed using the index.

   ```kotlin
   val firstNumber = numbers[0]
   println("First number: $firstNumber")
   ```

#### 3. **Iterating Through an Array:**
   - You can use a loop to iterate through the elements of an array.

   ```kotlin
   for (number in numbers) {
       println(number)
   }
   ```

#### 4. **Array Size:**
   - The `size` property provides the size of the array.

   ```kotlin
   val size = numbers.size
   println("Array size: $size")
   ```

#### 5. **Modifying Array Elements:**
   - Arrays created with `arrayOf` are mutable. You can modify elements.

   ```kotlin
   numbers[2] = 30
   ```

### Advanced Kotlin Array Concepts:

#### 1. **Array of Nullable Types:**
   - You can create an array of nullable types using `arrayOfNulls`.

   ```kotlin
   val nullableArray = arrayOfNulls<Int?>(5)
   ```

#### 2. **Filtering and Transforming Arrays:**
   - Use the `filter` and `map` functions for more advanced operations.

   ```kotlin
   val evenNumbers = numbers.filter { it % 2 == 0 }
   val squaredNumbers = numbers.map { it * it }
   ```

#### 3. **Array Operations with Libraries:**
   - The `kotlin-stdlib` library provides additional array functions.

   ```kotlin
   import kotlin.math.*

   val maxNumber = numbers.maxOrNull()
   val sum = numbers.sum()
   val average = numbers.average()
   ```

#### 4. **Multidimensional Arrays:**
   - Kotlin supports multidimensional arrays.

   ```kotlin
   val matrix = Array(3) { IntArray(3) }
   matrix[0] = intArrayOf(1, 2, 3)
   matrix[1] = intArrayOf(4, 5, 6)
   matrix[2] = intArrayOf(7, 8, 9)
   ```

#### 5. **Array of Custom Objects:**
   - Arrays can hold custom objects.

   ```kotlin
   data class Person(val name: String, val age: Int)

   val people = arrayOf(
       Person("Alice", 25),
       Person("Bob", 30),
       Person("Charlie", 22)
   )
   ```

#### 6. **Copying Arrays:**
   - Use `copyOf` to create a shallow copy of an array.

   ```kotlin
   val copyOfNumbers = numbers.copyOf()
   ```

#### 7. **Array Deconstruction:**
   - Deconstruct arrays into individual variables.

   ```kotlin
   val (first, second, third) = numbers
   ```

These examples cover both the basics and some advanced concepts related to Kotlin arrays. Experiment with these concepts and consider exploring more array-related functions available in the Kotlin Standard Library for a comprehensive understanding.