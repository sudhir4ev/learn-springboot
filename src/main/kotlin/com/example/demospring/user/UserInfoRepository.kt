package com.example.demospring.user

import org.springframework.data.repository.CrudRepository

interface UserInfoRepository : CrudRepository<UserInfo, Long> {
    fun findUserInfoByFirstName(name: String): UserInfo
}
