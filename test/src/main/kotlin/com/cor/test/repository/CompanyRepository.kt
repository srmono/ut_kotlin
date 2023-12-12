package com.cor.test.repository

import com.cor.test.model.Company
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface CompanyRepository : CoroutineCrudRepository<Company, Long> {
    fun findByNameContaining(name: String): Flow<Company>
}