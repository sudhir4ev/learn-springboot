package com.example.demospring.web

import com.example.demospring.user.UserInfo
import com.example.demospring.user.UserInfoRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class UserInfoRepositoryTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val userInfoRepository: UserInfoRepository,
) {
    @Test
    fun `When findUserInfoByFirstName then return UserInfo`() {
        val john = UserInfo("John", "Doe")
        val kane = UserInfo("Kane", "DoLittle")
        entityManager.persist(john)
        entityManager.persist(kane)
        entityManager.flush()

        val found = userInfoRepository.findUserInfoByFirstName("John")
        assertThat(found).isEqualTo(john)
    }
}
