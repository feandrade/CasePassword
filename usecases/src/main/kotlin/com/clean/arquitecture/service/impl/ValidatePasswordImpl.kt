package com.clean.arquitecture.service.impl

import com.clean.arquitecture.service.ValidatePassword
import com.clean.arquitecture.service.helper.isPasswordValid
import org.springframework.stereotype.Service

@Service
class ValidatePasswordImpl(

): ValidatePassword {
    override fun isValid(password: String): Boolean {
        return isPasswordValid(password)
    }
}