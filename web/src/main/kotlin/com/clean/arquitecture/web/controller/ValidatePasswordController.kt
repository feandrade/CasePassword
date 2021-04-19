package com.clean.arquitecture.web.controller

import com.clean.arquitecture.service.ValidatePassword
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ValidatePasswordController(
    private val validatePassword: ValidatePassword

) {

    @PostMapping(path = ["validate-password"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun validatePassword(
        @RequestHeader(required = true) password: String
    ):ResponseEntity<Boolean> = ResponseEntity.ok(validatePassword.isValid(password))


}
