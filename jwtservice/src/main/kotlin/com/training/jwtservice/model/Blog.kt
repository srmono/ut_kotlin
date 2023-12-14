package com.training.jwtservice.model

import java.util.*

data class Blog(
    val id: UUID,
    val title: String,
    val content: String
)