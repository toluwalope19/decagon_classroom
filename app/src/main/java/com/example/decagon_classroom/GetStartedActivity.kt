package com.example.decagon_classroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStartedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
        val sharedPreferences = getSharedPreferences("USER_CREDENTIALS", MODE_PRIVATE)
        val isloggedin = sharedPreferences.getBoolean("ISLOGGEDIN", false)
        if (isloggedin)
        {
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
        }

        sign_up.setOnClickListener {

            val intent  = Intent(this, RegisterActivity::class.java)

            startActivity(intent)
        }


    }
}
