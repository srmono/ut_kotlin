fun main() {

    val consolePrinter = ConsolePrinter()

    //consolePrinter.

    val delegatingPrinter = DelegatingPrinter(consolePrinter)

    delegatingPrinter.print("Hello delegation")

}

interface Printer {
    fun print(message: String)
}

class ConsolePrinter: Printer {
    override fun print(message: String) {
        println(message)
    }
}

//Class that used delegation to implement Printer behavior
class DelegatingPrinter(private val printer: Printer): Printer by printer
