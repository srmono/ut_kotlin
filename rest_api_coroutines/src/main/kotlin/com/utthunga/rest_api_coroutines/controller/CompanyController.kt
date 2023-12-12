package com.utthunga.rest_api_coroutines.controller

import com.utthunga.rest_api_coroutines.dto.CompanyRequest
import com.utthunga.rest_api_coroutines.dto.CompanyResponse
import com.utthunga.rest_api_coroutines.model.Company
import com.utthunga.rest_api_coroutines.model.User
import com.utthunga.rest_api_coroutines.service.CompanyService
import com.utthunga.rest_api_coroutines.service.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/v1/companies")
class CompanyController(
    private val companyService: CompanyService,
    private val userService: UserService
) {

    @PostMapping
    suspend fun createCompany(@RequestBody companyRequest: CompanyRequest): CompanyResponse =
        companyService.saveCompany(
            company = companyRequest.toModel()
        )
            ?.toResponse()
            ?: throw ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected error during company creation."
            )

    @GetMapping
    suspend fun findCompany(
        @RequestParam("name", required = false) name: String?
    ): Flow<CompanyResponse> {
        val companies = name?.let { companyService.findAllCompaniesByNameLike(name) }
            ?: companyService.findAllcompanies()

        return companies
            .map { company ->
                company.toResponse(
                    users = findCompanyUsers(company)
                )
            }
    }


    //find company by id
    @GetMapping("/{id}")
    suspend fun findCompanyById(
        @PathVariable id: Long
    ): CompanyResponse =
        companyService.findCompanyById(id)
            ?.let { company ->
                company.toResponse(
                    users = findCompanyUsers(company)
                )
            }
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "Company with id $id was not found.")

    //Delete company by id
    @DeleteMapping("/{id}")
    suspend fun deleteCompanyById(
        @PathVariable id: Long
    ) {
        companyService.deleteCompanyById(id)
    }

    @PutMapping("/{id}")
    suspend fun updateCompany(
        @PathVariable id: Long,
        @RequestBody companyRequest: CompanyRequest
    ): CompanyResponse =
        companyService.updateCompany(
            id = id,
            requestedCompany = companyRequest.toModel()
        )
            .let { company ->
                company.toResponse(
                    users = findCompanyUsers(company)
                )
            }

    private suspend fun findCompanyUsers(company: Company) =
        userService.findUsersByCompanyId(company.id!!)
            .toList()
}


private fun CompanyRequest.toModel(): Company =
    Company(
        name = this.name,
        address = this.address
    )

private fun Company.toResponse(users: List<User> = emptyList()): CompanyResponse =
    CompanyResponse(
        id = this.id!!,
        name = this.name,
        address = this.address,
        users = users.map(User::toResponse)
    )
