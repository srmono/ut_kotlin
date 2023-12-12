fun main() {

    val emp1 = Employee("Venkat", 30)
    val emp2: Employee? = null

    emp1?.let {
        nonNullPerson ->
            println("Name: ${nonNullPerson.name}")
            println("Age: ${nonNullPerson.age ?: "AgeNot specified"}")
    }
//if(emp1 != null){}
    emp2?.let {
            nonNullPerson ->
        println("Name: ${nonNullPerson.name}")
        println("Age: ${nonNullPerson.age ?: "AgeNot specified"}")
        println("This block will not execute for null object")
    } ?: run {
        println("The object is null")
    }

}

data class Employee(val name: String, val age: Int?)


//fun main() {
//
//    //also
//    var user  = User("Venkat", "bvsrao91@gmail.com")
//
//    //performing additional action without modifying user object
//    val updatedUser = user.also {
//        sendWelcomeMail(it)
//        logUserCreation(it)
//    }
//
//    println("original : $user")
//    println("mod : $updatedUser")
//
//    //modify props
//    val updateddUser = user.run {
//        copy(username="venkat")
//    }
//
//}
//
//fun sendWelcomeMail(user: User){
//    println("sending welcome mail to ${user.email}")
//}
//
//fun logUserCreation(user: User){
//    println("sending welcome mail to ${user.username}")
//}
//
//data class User(var username: String, var email: String)
