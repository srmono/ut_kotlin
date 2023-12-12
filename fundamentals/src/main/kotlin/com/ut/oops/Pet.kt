fun main() {

    var venkat = PetOwner();
    venkat.name = "venkat"

    println(venkat.name)

    val newPet = Pet()
    newPet.name = "Fred"

    venkat.pet = newPet
}

class Pet {

    var name: String? = null
}

class PetOwner{
    var name: String = ""

    var pet: Pet = Pet()
}



