package com.training.jwtservice.dto

data class UserRequest(
    val email: String,
    val password: String,
)