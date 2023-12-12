
fun main() {

//    val venkat = Person()
//    venkat.name = "venkat"
//    //venkat.calories = 10
//
////    venkat.updateCalories(10)
//
//    println("${venkat.name} has eaten?:  ${venkat.hasEaten} ")
//    venkat.feedMe("BreakFast")
//    println("${venkat.name} has consumed ${venkat.calories} calories")

    //println("${venkat.name} has eaten?:  ${venkat.hasEaten} ")


    //println("${venkat.name} has consumed ${venkat.calories} calories")

//    val empty = Empty()
//
//
//    println("Name is ${venkat.name}")
//
//    println("${venkat.name} has consumed ${venkat.calories} calories")
//
//    venkat.feedMe("BreakFast")
//
//    println("${venkat.name} has consumed ${venkat.calories} calories")

    var original = "Venkat    is     a    Trainer"

    //val updated = replaceMultipleWhiteSpaces(original)
    val updated = original.replaceMultipleWhiteSpaces()

    println(original)
    println(updated)

}
//

//fun replaceMultipleWhiteSpaces(value: String): String{
//    val regex = Regex("\\s+")
//    return regex.replace(value, " ")
//}


fun String.replaceMultipleWhiteSpaces(): String{
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}

class Empty

class Person {

    var name: String = ""
       // get() = field
        set(value){
            if (value.isEmpty()) throw Exception();
            field = value
        }

   var calories = 0
   private set(value) {
        field=value
    }

    val hasEaten: Boolean
    get() = calories !=0

    fun feedMe(food: String){
        //println("$name has been fed $food")
        updateCalories(calories)
    }

     fun updateCalories(calories: Int){
        this.calories += 100
    }
}
