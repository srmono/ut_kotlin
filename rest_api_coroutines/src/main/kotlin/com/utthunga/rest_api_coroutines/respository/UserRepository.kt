package com.utthunga.rest_api_coroutines.respository

import com.utthunga.rest_api_coroutines.model.User
import kotlinx.coroutines.flow.Flow
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository: CoroutineCrudRepository<User, Long> {

    fun findByNameContaining(name: String): Flow<User>
    fun findByCompanyId(companyId: Long): Flow<User>

    @Query("SELECT * FROM utthunga.app_user WHERE email= :email")
    fun randomNameFindByEmail(email: String): Flow<User>
}