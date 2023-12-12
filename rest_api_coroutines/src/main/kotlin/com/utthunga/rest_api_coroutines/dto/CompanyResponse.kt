package com.utthunga.rest_api_coroutines.dto

data class CompanyResponse(
    val id: Long,
    val name: String,
    val address: String,
    val users: List<UserResponse>
)
