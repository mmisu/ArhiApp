package com.example.arhiapp

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return (email == "misu@arhimedes.ro" &&
                password == "mogosa.2010") ||
                (email == "mihai.moisei@gmail.com" &&
                password == "mogosa.19")
    }
}