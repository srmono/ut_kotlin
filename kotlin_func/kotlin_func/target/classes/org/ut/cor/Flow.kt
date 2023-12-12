import kotlinx.coroutines.flow.*;
import kotlinx.coroutines.runBlocking

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() = runBlocking {
   val sharedFlow: MutableSharedFlow<Int> = MutableSharedFlow()

    launch {
        repeat(5){
            delay(1000)
            sharedFlow.emit(it)
        }
    }


    sharedFlow.collect { value ->  println("Collecteor 1: $value")  }

    sharedFlow.collect { value ->  println("Collecteor 2: $value")  }

}
//
//fun main() = runBlocking {
//    val coldFlow: Flow<Int> = flow {
//        repeat(5){
//            delay(1000)
//            emit(it)
//        }
//    }
//
//    //first collector
//    coldFlow.collect { value -> println("Collecteor 1: $value")  }
//
//    //second collector
//    coldFlow.collect { value -> println("Collecteor 2: $value")  }
//
//}
//
