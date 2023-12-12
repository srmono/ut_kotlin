import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*


suspend fun main (){
    val channel = Channel<Int>()

    //Convert channel to Flow
    val flowFromChannel: Flow<Int> = channel.consumeAsFlow()

    //Flow emitting values
    val flow = flow {
        for (i in 1..5) {
            delay(1000)
            emit(i)
        }
    }

    val mergedFlow: Flow<Pair <Int, Int>> = flowFromChannel.zip(flow) {
        channelValue, flowValue -> channelValue to flowValue
    }

    mergedFlow.collect{
            (channelValue, flowValue) -> println("Received Channel value: $channelValue and flow value: $flowValue")
    }


//    //combine the flow
//    //var mergedFlow: Flow<Int> = flowFromChannel.flatMapMerge { flow }
//    var mergedFlow: Flow<Int> = flowFromChannel.flatMapMerge { flowOf(it) }.meege(flow)
//
////    //Collecting values from the merged flow
//     mergedFlow.collect{value -> println("Received $value") }

    channel.close()
}