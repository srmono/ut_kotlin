package com.training.jwtservice.dto

import java.util.*

data class BlogResponse(
    val id: UUID,
    val title: String,
    val content: String,
)
