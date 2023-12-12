package com.cor.test.model

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table(name="app_user" , schema="application")
data class User(
        @Id val id: Long? = null,
        val email: String,
        val name: String,
        val age: Int,
        val companyId: Long
)
