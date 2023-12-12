fun main() {
//    printItem("Hello Generic") //STring
//    printItem(42) // Int
//    printItem(36.9) // Double

//    var strBox = Box("Kotlin")
//    var intBox = Box(42)
//
//    println(strBox.item)
//    println(intBox.item)


}


//Generic Functions
fun <T> printItem(item: T){
    println(item)
}

//Generic Classes
class Box<T>(val item: T)

////Generic functions with constraints
//fun <T : Number> add(a:T, b: T): T{
//    return  a + b
//}

//Generic Interfaces
open class Fruit

class Apple: Fruit()
class Banana: Fruit()

class Basket<T: Fruit> {
    private  val items = mutableListOf<T>()

    fun addItem(item: T){
        println(item)
    }

    fun displayItems(){
        for (item in items){
            println(item)
        }
    }

}
