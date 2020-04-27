package com.example.arhiapp

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return email == "misu@arhimedes.ro" &&
                password == "mogosa.2010"
    }
}