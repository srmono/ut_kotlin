package com.training.jwtservice.repository

import com.training.jwtservice.model.Blog
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class  BlogRepository {
    private val blogs = listOf(
        Blog(id = UUID.randomUUID(), title= "Article 1", content= "Content 1"),
        Blog(id = UUID.randomUUID(), title= "Article 2", content= "Content 2"),
    )
    fun findAll(): List<Blog> =
        blogs
}