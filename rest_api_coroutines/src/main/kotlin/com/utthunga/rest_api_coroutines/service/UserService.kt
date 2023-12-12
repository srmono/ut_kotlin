package com.utthunga.rest_api_coroutines.service

import com.utthunga.rest_api_coroutines.model.User
import com.utthunga.rest_api_coroutines.respository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserService(
    private val userRepository: UserRepository
) {
    suspend fun saveUser(user: User): User? =
        userRepository.randomNameFindByEmail(user.email)
            .firstOrNull()
            ?.let { throw ResponseStatusException(HttpStatus.BAD_REQUEST, "The use already exists with the email id") }
            ?: userRepository.save(user)

    suspend fun findAllUsers(): Flow<User> =
        userRepository.findAll()

    suspend fun findUserById(id: Long): User? =
        userRepository.findById(id)

    suspend fun deleteUserById(id: Long) {
        val foundUser = userRepository.findById(id);
    }

    suspend fun updateUser(id: Long, requestedUser: User): User {
        val foundUser = userRepository.findById(id)

        return if (foundUser == null)
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "User with id $id was not found.")
        else
            userRepository.save(
                requestedUser.copy(id = foundUser.id)
            )
    }

    suspend fun findAllUsersByNameLike(name: String): Flow<User> =
        userRepository.findByNameContaining(name)

    suspend fun findUsersByCompanyId(id: Long): Flow<User> =
        userRepository.findByCompanyId(id)

}