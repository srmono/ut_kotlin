package com.utthunga.rest_api_coroutines.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name="company", schema = "utthunga")
data class Company(
    @Id val id: Long? = null,
    val name: String,
    val address: String
)
