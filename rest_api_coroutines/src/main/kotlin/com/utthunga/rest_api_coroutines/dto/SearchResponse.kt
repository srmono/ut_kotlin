package com.utthunga.rest_api_coroutines.dto

data class SearchResponse(
    val id: Long,
    val name: String,
    val type: ResultType
)
