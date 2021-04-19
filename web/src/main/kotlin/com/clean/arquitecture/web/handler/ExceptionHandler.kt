package com.clean.arquitecture.web.handler

import com.clean.arquitecture.domain.exception.ApiError
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class ExceptionHandler() {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception): ApiError{

        return  ApiError(
                code = "server.error",
                message = ex.message ?: "Erro interno no servidor"
            )

    }

}
