//inline function
inline fun <reified T> printType(value: T){
    println("Type of $value is ${T::class::simpleName} ")
}

fun main() {
    printType(42)
    printType("Kotlin")
}

