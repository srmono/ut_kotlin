package com.training.jwtservice.dto

data class AuthenticationRequest(
    val email: String,
    val password: String,
)