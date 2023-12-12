//
//data class Emp(val name:String, val age: Int){
//    val customName: String
//    init {
//        customName = name.uppercase()
//    }
//
//    override fun toString(): String {
//        return "Emp(name=$name, customname = $customName)"
//    }
//}

data class Emp(var name: String, val url: String){
    val givenName: String
    val otherName: String

    init {
        val parts:List<String> = name.split(" ")
        givenName = parts[0].uppercase()
        otherName = parts[1].uppercase()
    }

    override fun toString(): String {
        return  "Emp(name=$name, givenName = $givenName) "
    }
}

fun main() {

    val venkat = Emp("Bvs Rao", "https://..")
    println(venkat)

    val newEmp: Emp = venkat.copy(name = "venkat")

    //val(pname) = newEmp



    //println(pname)
//    var p1 = Emp("venkat", 36)
//    var p2 = Emp("vsr", 63)
//
//    ///toString()
//    println("P1:  $p1")
//    println("P2:  $p2")
//
//    //Equals()
//    println("Are they equal? ${p1 == p2}")
//    println("Hashcoe ${p1.hashCode()}")
//
//    val p3 = p1.copy(age = 26)
//    println("Person 3 $p3")

}



//import java.net.IDN
//
////import java.lang.IllegalArgumentException
//
//fun main() {
////    val e = Employee("dfsdf", "Venkat")
//    val e = Employee(Id("111-aaa"), GivenName("Venkat"))
//}
//
//class Book(id: Id){
//}
//
//class Employee(val id: Id, val givenName: GivenName){
//    fun doSomethingWithId(){
//        println(id.id)
//    }
//
//    fun getLenth(){
//        givenName.length
//    }
//}
//
//
//@JvmInline
//value class Id(val id: String){
//    init {
//        if(id.isEmpty()) throw IllegalArgumentException();
//        if(!id.matches(
//                Regex("\\d{3}-[a-zA-Z]{3}\$")
//            )) throw IllegalArgumentException()
//    }
//}
//
//@JvmInline
//value class GivenName(val name: String){
//
//    val length:Int
//        get() = name.length
//
//    init {
//        if(name.isEmpty()) throw IllegalArgumentException();
//        if(name.contains(" ")) throw IllegalArgumentException();
//    }
//}
//
