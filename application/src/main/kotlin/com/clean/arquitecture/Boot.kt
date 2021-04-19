package com.clean.arquitecture

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.clean.arquitecture")
class Boot{
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Boot::class.java, *args)
        }
    }
}