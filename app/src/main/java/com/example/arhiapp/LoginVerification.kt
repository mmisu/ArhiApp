package com.example.arhiapp

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "misu@arhimedes.ro" &&
                 password == "mogosa.2000") ||
                (email == "mihai.moisei@gmail.com" &&
                password == "ignis.19")
    }
}