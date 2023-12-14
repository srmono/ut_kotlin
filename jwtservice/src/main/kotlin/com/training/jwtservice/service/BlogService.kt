package com.training.jwtservice.service


import com.training.jwtservice.model.Blog
import com.training.jwtservice.repository.BlogRepository
import org.springframework.stereotype.Service

@Service
class BlogService(
    private val blogRepository: BlogRepository
) {

    fun findAll(): List<Blog> =
        blogRepository.findAll()
}