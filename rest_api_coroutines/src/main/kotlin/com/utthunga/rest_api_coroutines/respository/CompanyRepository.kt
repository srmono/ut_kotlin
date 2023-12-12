package com.utthunga.rest_api_coroutines.respository

import com.utthunga.rest_api_coroutines.model.Company
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface CompanyRepository: CoroutineCrudRepository<Company, Long> {
    fun findByNameContaining(name: String): Flow<Company>
}