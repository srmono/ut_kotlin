fun main() {

    val successResult = Result.Success(42)
    val errorResult = Result.Error("Something went wrong")
    val loadingResult = Result.Loading

    processResult(successResult)
    processResult(errorResult)
    processResult(loadingResult)

}

sealed class Error(){

}

sealed class Result{
    data class Success(val value: Int): Result()
    data class Error(val message: String): Result()
    object Loading: Result()
}

fun processResult(result: Result){
    when(result){
        is Result.Success -> println("Success: ${result.value}")
        is Result.Error -> println("Success: ${result.message}")
        Result.Loading -> println("Loading")
    }
}