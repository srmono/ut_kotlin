package org.ut

//data class Person(val name: String, var age: Int)
data class Person(var name: String, var age: Int, var city: String)

fun main(args: Array<String>) {

    val person = Person("venkat", 25, "Bangalore")

    //using apply to modify properties
//    val modfiedPerson = person.copy().apply {
//        age = 36
//        city="Hyderabad"
//    }
//
//    println("original $person")
//    println("modified $modfiedPerson")

    val numbers = mutableListOf(1, 2, 3)

    val result = numbers.also {
        it.add(4)
        it.add(5)
    }

    println(result)

    //Let keyword
//    val result = "Hello, Kotlin".let {
//        val length = it.length
//        "Length of the string is $length"
//    }
//
//    println(result)

    // run

//    val result = mutableListOf(1, 2, 3).run {
//        add(4)
//        add(5)
//        this // returns the modified list
//    }
//
//    println(result)



//    val person = Person("Alice", 30)
//
//    val result = with(person) {
//        age += 5
//        "Name: $name, Updated Age: $age"
//    }
//
//    println(result)

//    data class Car(var brand: String, var model: String, var year: Int)
//
//    val car = Car("Toyota", "Camry", 2022).apply {
//        year = 2023
//        model = "Corolla"
//    }
//
//    println(car)



//    var names = listOf("Venkat", "Sujay", "Kotlin", "Subbarao")
//
//    val filteredNames = filterNamesByPrefix(names, "S" )
//
//    println(filteredNames)

    //println("Hello, World")

//    val additionResult = calculate(5, 3) { x, y -> x + y }
//    val multiplicationResult = calculate(5, 3) { x, y -> x * y }
//
//    println("Addition Result: $additionResult")
//    println("Multiplication Result: $multiplicationResult")
}

////filter names by prefix
//fun filterNamesByPrefix(names: List<String>, prefix: String): List<String>{
//    return names.filter {name -> name.startsWith(prefix, ignoreCase = true)}
//}

//fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
//    return operation(a, b)
//}





