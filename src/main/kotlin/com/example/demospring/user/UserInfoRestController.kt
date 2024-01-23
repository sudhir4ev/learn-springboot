package com.example.demospring.user

import org.springframework.http.ResponseEntity
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserInfoRestController(
    private val userInfoService: UserInfoService
) {

    @GetMapping(
        "/info",
        produces = ["application/json"],
    )
    fun getUserInfo(model: Model): ResponseEntity<UserInfo> {
        val userInfo = userInfoService.getUserInfo()
        model["title"] = ""
        return ResponseEntity.ok().body(userInfo)
    }

}
