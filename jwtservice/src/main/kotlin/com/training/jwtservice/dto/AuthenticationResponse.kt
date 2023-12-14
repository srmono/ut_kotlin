package com.training.jwtservice.dto

data class AuthenticationResponse(
    val accessToken: String,
    val refreshToken: String,
)
