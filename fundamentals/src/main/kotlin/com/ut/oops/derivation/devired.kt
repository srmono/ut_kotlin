fun main() {

    var dog = Dog();
    var cat = Cat()

    announceAnimalSound(dog)
    announceAnimalSound(cat)
}

open class Animal {
    open fun makeSound(): String{
        return  "Generic animal sound"
    }
}

//Dog class Inheriting from Animal

class Dog: Animal(){
    override fun makeSound(): String {
        return "Meow mewo"
    }
}


class Cat: Animal(){
    override fun makeSound(): String {
        return "Woof woof"
    }
}

fun announceAnimalSound(animal: Animal){
    println("This animal says: ${animal.makeSound()}")
}








//fun main() {
//
//    val venkat = Student("venkat")
//
//    println("${venkat.name}")
//}
//
//
//
//open class Personss(open val name: String){
//    constructor( name: String, id: Int): this(name){}
//
//    open fun addFriend(friendName: String){
//        println("adding friend")
//    }
//}
//
//class Student(override var name: String): Personss(name){
//}
//
//
////open class Personss(val name: String){
////    //constructor(name: String, id: Int): this(name){}
////
////    open fun addFriend(friendName: String){
////
////    }
////}
////
////class Student(name: String): Personss(name){
////
////   override fun addFriend(friendName: String){
////
////    }
////}
//
//
//
//
//
////fun main(args: Array<String>) {
////
////    val venkat = Personss("venkat", 99)
////    println(venkat.toString())
////
////
////}
////
////open class Personss(var name: String){
////    constructor(name: String, id: Int): this(name){}
////}
////
////class Student(name: String, id: Int): Personss(name) {
//////    constructor(name: String, id: Int): super(name,id)
////
////    constructor(name: String, id: Int, grade: String): this(name,id)
////}
////
////
////
//////class Student: Personss {
//////    constructor(name: String, id: Int): super(name,id)
//////
//////    constructor(name: String, id: Int, grade: String): super(name,id)
//////}
////
////
//////class Student(name: String): Personss(name, id)
//////class Student(name: String): Personss(name)