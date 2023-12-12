package com.utthunga.rest_api_coroutines.dto

data class UserResponse(
    val id: Long,
    val email: String,
    val name: String,
    val age: Int,
)
