fun main() {

    val venkat = Human("venkat")
    venkat.initAddr()
    venkat.address.street

    //venkat.


    println("${venkat.name} and ${venkat.id}")
}

class Human(var name: String, var id: Int = 0, age: Int = 0){

    lateinit var address: Address

    fun initAddr(){
        address = Address()
    }
}

class Address {
    val street = "Some Street"
}



//
//class Human(var name: String, var id: Int = 0, age: Int = 0){
//    init {
//        println("Initialized the object")
//    }
//
//    init {
//        println("Initialized the object in another init")
//    }
//}