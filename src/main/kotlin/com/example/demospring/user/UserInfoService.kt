package com.example.demospring.user

import org.springframework.stereotype.Service

@Service
class UserInfoService {

    fun getUserInfo(): UserInfo {
        return UserInfo("John", "Doe")
    }

}

