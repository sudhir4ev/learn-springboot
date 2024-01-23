package com.example.demospring

import lombok.extern.java.Log
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

@SpringBootApplication
@Log
class DemoSpringApplication(val dataSource: DataSource) {
    private val _dataSource = dataSource

    private val restTemplate: JdbcTemplate = JdbcTemplate(this._dataSource)



}

fun main(args: Array<String>) {
    runApplication<DemoSpringApplication>(*args)
}
