package com.lavkush.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class New_Activity : AppCompatActivity() {
   /* override fun onClick(p0: View?) {
    Toast.makeText(this@New_Activity,"you clicked on button",Toast.LENGTH_LONG).show()
    }*/
   lateinit var etMobileNumber: EditText
   lateinit var etPassword :EditText
   lateinit var btnLogin:Button
   lateinit var txtForget:TextView
   lateinit var textRegister:TextView
   val enobileNumber="0123456789"
    val etPass="thanos"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "Log In"
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPass)
        btnLogin = findViewById(R.id.button)
        txtForget = findViewById(R.id.forgotPass)
        textRegister = findViewById(R.id.register)

        btnLogin.setOnClickListener {
            val mobileNumber = etMobileNumber.text.toString()

            val password = etPassword.text.toString()
            if ((mobileNumber == enobileNumber) && (password == etPass)) {
                val intent = Intent(this@New_Activity, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@New_Activity, "Incorrect Password",Toast.LENGTH_LONG).show()
            }
        }
    }
    }
