package com.training.jwtservice.service

/*
UserDetails represents the core user information. In our case, we will use the default implementation called User, which holds the default information, such as username, password, and a collection of granted authorities (roles).

The UserDetailsService is nothing else than an interface used to load user-specific data. It is used by Spring Security to interact with our data source and validate users during authentication.

 */


import com.training.jwtservice.repository.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

typealias ApplicationUser = com.training.jwtservice.model.User

@Service
class CustomUserDetailsService(
    private val userRepository: UserRepository
) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails =
        userRepository.findByEmail(username)
            ?.mapToUserDetails()
            ?: throw UsernameNotFoundException("Not found!")

    private fun ApplicationUser.mapToUserDetails(): UserDetails =
        User.builder()
            .username(this.email)
            .password(this.password)
            .roles(this.role.name)
            .build()
}