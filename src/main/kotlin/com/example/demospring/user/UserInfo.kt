package com.example.demospring.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class UserInfo(
    var firstName: String? = null,
    var lastName: String? = null,

    @Id
    @GeneratedValue
    var id: Long? = null,
)
