import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    println("Main Thread: ${Thread.currentThread().name}")

    launch(Dispatchers.IO) {
        println("Coroutine Thread Name: ${Thread.currentThread().name}")

        var userData = withContext(Dispatchers.Default){

            //simulate some CPU-intensive processing
            delay(1000)
            "process user data"
        }

        println("User Data: $userData")
    }

    //some other work is running in the main thread
    println("Main thread continuew doing other work")
    Thread.sleep(10000)// wait for the coroutine to complete
}

suspend fun fetchuserData(): String{
    delay(2000)
    return "User Data from network"
}



//fun main() {
//
//    runBlocking {
//        println()
//    }
////    println("Main Thread: ${Thread.currentThread().name}")
////
////    GlobalScope.launch {
////        //Below code will be execute in a coroutine
////        println("Coroutine Thread Name: ${Thread.currentThread().name}")
////        repeat(5){
////            println("coroutine is working $it")
////            delay(1000)
////        }
////
////        println("coroutine is Done")
////    }
////
////    //some other work is running in the main thread
////    println("Main thread continuew doing other work")
////    Thread.sleep(10000)// wait for the coroutine to complete
//
//}



//fun main() = runBlocking {
//    println("Start")
//    delay(10000) // This delay does not block the thread
//    println("End")
//}