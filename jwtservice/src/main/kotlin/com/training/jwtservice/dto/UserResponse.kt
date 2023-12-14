package com.training.jwtservice.dto

import java.util.*

data class UserResponse(
    val uuid: UUID,
    val email: String,
)