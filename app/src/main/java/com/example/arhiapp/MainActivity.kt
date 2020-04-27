package com.example.arhiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.editTextEmail)
        password = findViewById(R.id.editTextPassword)
        login = findViewById(R.id.buttonLogin)

        login.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(loginVerification.verify(email.text.toString(), password.text.toString()))
        {
           Toast.makeText(this, "Logare reusita", Toast.LENGTH_SHORT).show()
        } else {
              Toast.makeText(this, "Eroare logare", Toast.LENGTH_SHORT).show()
        }

    }

    /* override fun onClick(v: View?) {
         if (loginVerification.verify(email.text.toString(), password.text.toString())) {
             Toast.makeText(this, "Logare reusita", Toast.LENGTH_SHORT).show()
         } else {
             Toast.makeText(this, "Eroare logare", Toast.LENGTH_SHORT).show()
         }
     }*/
}




