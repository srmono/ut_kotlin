# Nested coroutines. 

Imagine you have a scenario where you need to fetch user details from a remote server and, based on that information, fetch additional details from a local database. We'll use nested coroutines to represent this sequential process.

```kotlin
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

data class UserData(val id: Long, val name: String)

// Simulate fetching user data from a remote server
suspend fun fetchUserDataFromServer(userId: Long): UserData {
    delay(1000) // Simulating network delay
    println("Fetching user data from server for user $userId")
    return UserData(userId, "User from Server $userId")
}

// Simulate fetching additional details from a local database
suspend fun fetchAdditionalDetailsFromDatabase(user: UserData): String {
    delay(1500) // Simulating database delay
    println("Fetching additional details from database for user ${user.id}")
    return "Additional details for ${user.name}"
}

fun main() = runBlocking {
    val userId = 1L

    // Launch the coroutine to fetch user data from the server
    val serverUserData = async { fetchUserDataFromServer(userId) }.await()

    // Launch a nested coroutine to fetch additional details from the database based on the server data
    val additionalDetails = async { fetchAdditionalDetailsFromDatabase(serverUserData) }.await()

    println("User details: ${serverUserData.name}, $additionalDetails")
}
```

In this example:

1. The `fetchUserDataFromServer` function simulates fetching user data from a remote server.
2. The `fetchAdditionalDetailsFromDatabase` function simulates fetching additional details from a local database based on the user data obtained from the server.

In the `main` function, we launch the coroutine to fetch user data from the server asynchronously using `async`. Once we have the server data, we launch a nested coroutine to fetch additional details from the database based on the server data. The `await` function is used to wait for the results of both coroutines.

This represents a real-world scenario where you might need to perform sequential asynchronous tasks, and nested coroutines are a natural fit for expressing this kind of workflow.