package com.example.demospring.web

import com.example.demospring.user.InfoService
import com.example.demospring.user.UserInfo
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class InfoController(
    private val infoService: InfoService
) {

    @GetMapping(
        "/info",
        produces = ["application/json"],
    )
    fun getUserInfo(): ResponseEntity<UserInfo> {
        val userInfo = infoService.getUserInfo()
        return ResponseEntity.ok().body(userInfo)
    }

}
