package com.utthunga.rest_api_coroutines.controller

import com.utthunga.rest_api_coroutines.dto.UserRequest
import com.utthunga.rest_api_coroutines.dto.UserResponse
import com.utthunga.rest_api_coroutines.model.User
import com.utthunga.rest_api_coroutines.service.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userService: UserService
) {

    @PostMapping
    suspend fun createuser(
        @RequestBody userRequest: UserRequest
    ): UserResponse =
        userService.saveUser(
            user = userRequest.toModel()
        )
            ?.toResponse()
            ?: throw ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "unexpected error during user creation")

    //find users
    @GetMapping
    suspend fun findUsers(
        @RequestParam("name", required= false) name: String?
    ): Flow<UserResponse>{
        val users = name?.let { userService.findAllUsersByNameLike(name)}
            ?: userService.findAllUsers()

        return users.map ( User::toResponse )
    }

    // Get user by id
    @GetMapping("/{id}")
    suspend fun findUserById(
        @PathVariable id: Long
    ): UserResponse =
        userService.findUserById(id)
            ?.let(User::toResponse)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User nwith id $id was not found")

    //Delete the user
    @DeleteMapping("/{id}")
    suspend fun deleteUserById(
        @PathVariable id: Long
    ){
        userService.deleteUserById(id)
    }

    //Update user
    @PutMapping("/{id}")
    suspend fun updateUser(
        @PathVariable id: Long,
        @RequestBody userRequest: UserRequest
    ) =
        userService.updateUser(
            id = id,
            requestedUser = userRequest.toModel()
        )
            .toResponse()

}

private fun UserRequest.toModel(): User =
    User(
        email = this.email,
        name = this.name,
        age = this.age,
        companyId = this.companyId
    )

fun User.toResponse(): UserResponse =
    UserResponse(
        id = this.id!!,
        email = this.email,
        name = this.name,
        age = this.age
    )