package com.training.jwtservice.controller


import com.training.jwtservice.dto.BlogResponse
import com.training.jwtservice.model.Blog
import com.training.jwtservice.service.BlogService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/article")
class BlogController(
    private val blogService: BlogService
) {

    @GetMapping
    fun listAll(): List<BlogResponse> =
        blogService.findAll()
            .map { it.toResponse() }

    private fun Blog.toResponse(): BlogResponse =
        BlogResponse(
            id = this.id,
            title = this.title,
            content = this.content,
        )
}