package com.example.decagon_classroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val sharedPreferences = getSharedPreferences("USER_CREDENTIALS", MODE_PRIVATE)
        val isloggedin = sharedPreferences.getBoolean("ISLOGGEDIN", false)


        val requiredEmail = sharedPreferences.getString("EMAIL", "DEFAULT_EMAIL")
        val login = findViewById<Button>(R.id.submit_login)

        login.setOnClickListener {

            val email = Email_login.toString()
            if (email == requiredEmail)
            {
                sharedPreferences.edit().putBoolean("ISLOGGEDIN", false).apply()
                val main = Intent(this@LogInActivity, MainActivity::class.java)
                startActivity(main)
            }
        }

        }
    }

