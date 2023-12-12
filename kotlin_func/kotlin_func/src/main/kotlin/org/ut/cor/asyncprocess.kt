import kotlinx.coroutines.*

suspend fun fetchuserData(url: String): String{
    delay(2000)
    return "Data from $url"
}

suspend fun main() = coroutineScope {
    //List of urls to fetch data concurrently

    val urls = listOf(
        "https://jsonplaceholder.typicode.com/users",
        "https://jsonplaceholder.typicode.com/posts")

    //create a list of coroutine jobs
    val jobs = urls.map { url ->
        async{
            fetchuserData(url)
        }
    }

    //Execute jobs concurrently and await all results
    val results = jobs.awaitAll()

    results.forEachIndexed {
            index, result -> println("Data from ${urls[index]}")
    }
}

