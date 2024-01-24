package com.example.demospring

import org.assertj.core.api.Assertions.assertThat
import org.json.JSONObject
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoSpringApplicationTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `should return user info object`() {
        val entity = restTemplate.getForEntity<String>("/user/info")

        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)

        val bodyJSONObject = JSONObject(entity.body)

        assertThat(bodyJSONObject.get("firstName")).isEqualTo("John")
        assertThat(bodyJSONObject.get("lastName")).isEqualTo("Doe")
    }
}
