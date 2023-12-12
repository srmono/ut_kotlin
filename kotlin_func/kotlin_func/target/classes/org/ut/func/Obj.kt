fun main() {

    //Logger.log("Hello Kotlin ")

    var book1 = Book.createBook("Smart AI", "Vnkat")
    var book2 = Book.createBook("Smart ML", "Sujay")

    val totalBooks = Book.getTotalBooks()

    println("Total Books: $totalBooks")
}

//object Logger{
//    fun log(message: String){
//        println("Log: $message")
//    }
//}

class Book(val title: String, val Author: String){
    //companior object to track the total number of books
    companion object{
        private const val MAX_BOOKS = 100;
        private var totalBooks = 0

        fun createBook(title: String, Author: String): Book?{
           if(totalBooks < MAX_BOOKS){
               totalBooks++
               return Book(title, Author)
           } else{
               println("Cant create more than $MAX_BOOKS books")
               return null
           }
        }

        fun getTotalBooks():Int{
            return  totalBooks
        }
    }
}