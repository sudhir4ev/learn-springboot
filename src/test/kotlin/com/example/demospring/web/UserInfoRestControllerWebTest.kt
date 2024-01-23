package com.example.demospring.web

import org.junit.jupiter.api.Test

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
@AutoConfigureMockMvc
class UserInfoRestControllerWebTest() {

    @Autowired
    private val mockMvc: MockMvc? = null;

    @Test
    fun `should return user info object`() {
        this.mockMvc?.perform(get("/info"))?.andExpect(status().isOk())
    }
}
