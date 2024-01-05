package com.example.demospring.user
import org.springframework.stereotype.Service

@Service
class InfoService {

    fun getUserInfo(): UserInfo {
        return UserInfo("Hey there")
    }

}

class UserInfo {
    val name: String

    constructor(name: String) {
        this.name = name
    }
}
