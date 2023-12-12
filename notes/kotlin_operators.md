# Kotlin operators:

### Arithmetic Operators:

```kotlin
val sum = a + b
val difference = a - b
val product = a * b
val quotient = a / b
val remainder = a % b
```

### Assignment Operators:

```kotlin
var x = 10
x += 5 // Equivalent to x = x + 5
```

### Comparison Operators:

```kotlin
val isEqual = a == b
val isNotEqual = a != b
val greaterThan = a > b
val lessThan = a < b
val greaterThanOrEqual = a >= b
val lessThanOrEqual = a <= b
```

### Logical Operators:

```kotlin
val resultAnd = (a > 0) && (b < 10)
val resultOr = (a > 0) || (b < 10)
val resultNot = !(a > 0)
```

### Bitwise Operators:

```kotlin
val resultBitwiseAnd = a and b
val resultBitwiseOr = a or b
val resultBitwiseXor = a xor b
val resultBitwiseNot = a.inv()
```

### Elvis Operator (Safe Call Operator):

```kotlin
val result = nullableValue ?: defaultValue
```

### Range Operator:

```kotlin
val range = 1..10 // includes 1, 2, ..., 10
```

### Type Checking and Casting:

```kotlin
val isString = value is String
val castedString = value as? String
```

### In Operator (Checking Membership):

```kotlin
val isInRange = x in 1..10
val isNotInList = value !in listOf(1, 2, 3)
```

### Indexing Operator:

```kotlin
val element = array[2]
```

### Invoke Operator (Function Call):

```kotlin
val result = myFunction.invoke(arg1, arg2)
// or shorthand
val result = myFunction(arg1, arg2)
```

### Destructuring Declarations:

```kotlin
val (first, second) = pair
```

These cover a wide range of operators in Kotlin, including arithmetic, assignment, comparison, logical, bitwise, special operators, type checking, casting, range, and more.


--- 

Kotlin supports a variety of operators for different operations such as arithmetic, logical, bitwise, assignment, and more. Here's an overview of some common operators in Kotlin:

### Arithmetic Operators:

- **Addition (+):** Adds two numbers.
  ```kotlin
  val sum = a + b
  ```

- **Subtraction (-):** Subtracts the right operand from the left.
  ```kotlin
  val difference = a - b
  ```

- **Multiplication (*):** Multiplies two numbers.
  ```kotlin
  val product = a * b
  ```

- **Division (/):** Divides the left operand by the right.
  ```kotlin
  val quotient = a / b
  ```

- **Modulus (%):** Returns the remainder of the division.
  ```kotlin
  val remainder = a % b
  ```

### Assignment Operators:

- **Assignment (=):** Assigns the value on the right to the variable on the left.
  ```kotlin
  var x = 10
  ```

- **Compound Assignment Operators (e.g., `+=`, `-=`, `*=`, `/=`):** Combine an operation with assignment.
  ```kotlin
  x += 5 // Equivalent to x = x + 5
  ```

### Comparison Operators:

- **Equality (==):** Checks if two values are equal.
  ```kotlin
  val isEqual = a == b
  ```

- **Inequality (!=):** Checks if two values are not equal.
  ```kotlin
  val isNotEqual = a != b
  ```

- **Other Comparisons (>, <, >=, <=):** Compare values.
  ```kotlin
  val greaterThan = a > b
  ```

### Logical Operators:

- **AND (&&):** Returns true if both operands are true.
  ```kotlin
  val result = (a > 0) && (b < 10)
  ```

- **OR (||):** Returns true if at least one operand is true.
  ```kotlin
  val result = (a > 0) || (b < 10)
  ```

- **NOT (!):** Negates the result.
  ```kotlin
  val result = !(a > 0)
  ```

### Bitwise Operators:

- **Bitwise AND (&):** Performs a bitwise AND operation.
- **Bitwise OR (|):** Performs a bitwise OR operation.
- **Bitwise XOR (^):** Performs a bitwise XOR (exclusive OR) operation.
- **Bitwise NOT (~):** Inverts the bits.

### Elvis Operator (?:):

- Used for providing a default value when a nullable expression is null.
  ```kotlin
  val result = nullableValue ?: defaultValue
  ```

### Range Operator (..):

- Creates a range of values.
  ```kotlin
  val range = 1..10 // includes 1, 2, ..., 10
  ```

These are just some of the key operators in Kotlin. The language provides additional operators and features for various use cases, and custom operators can be defined as well.