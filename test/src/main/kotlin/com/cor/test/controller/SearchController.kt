package com.cor.test.controller

import com.cor.test.dto.IdNameTypeResponse
import com.cor.test.dto.ResultType
import com.cor.test.model.Company
import com.cor.test.model.User
import com.cor.test.service.CompanyService
import com.cor.test.service.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.merge
//import org.apache.catalina.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/search")
class SearchController(
        private val userService: UserService,
        private val companyService: CompanyService
) {

    @GetMapping
    suspend fun searchByNames(
            @RequestParam(name = "query") query: String
    ): Flow<IdNameTypeResponse> {
        val usersFlow = userService.findAllUsersByNameLike(name = query)
                .map(User::toIdNameTypeResponse)
        val companiesFlow = companyService.findAllCompaniesByNameLike(name = query)
                .map(Company::toIdNameTypeResponse)

        return merge(usersFlow, companiesFlow)
    }
}

private fun User.toIdNameTypeResponse(): IdNameTypeResponse =
        IdNameTypeResponse(
                id = this.id!!,
                name = this.name,
                type = ResultType.USER
        )

private fun Company.toIdNameTypeResponse(): IdNameTypeResponse =
        IdNameTypeResponse(
                id = this.id!!,
                name = this.name,
                type = ResultType.COMPANY
        )