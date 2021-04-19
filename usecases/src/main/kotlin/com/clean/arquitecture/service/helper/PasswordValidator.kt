package com.clean.arquitecture.service.helper

import java.util.regex.Matcher
import java.util.regex.Pattern

private val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"
private val pattern: Pattern = Pattern.compile(PASSWORD_PATTERN)

fun isPasswordValid(password:String):Boolean{
    val isValid = isValid(password)

    if (isValid) {
        password.forEach {
            if (occurrenceCharacter(password,it) > 1) return false
        }
    }
    return isValid
}

private fun occurrenceCharacter(s: String, c: Char): Int {
    return if (s == "") 0
    else if (s[0] == c) occurrenceCharacter(s.substring(1), c) + 1
    else occurrenceCharacter(s.substring(1), c)
}


private fun isValid(password: String): Boolean {
    if (password.length<9) return false
    val matcher: Matcher = pattern.matcher(password)
    return matcher.matches()
}


