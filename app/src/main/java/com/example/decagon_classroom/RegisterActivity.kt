package com.example.decagon_classroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_get_started.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_verification.*
import kotlinx.android.synthetic.main.app_bar.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        Email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s : Editable?){}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                error_message2.visibility = View.GONE
                error_message.visibility = View.GONE
                Email.setBackgroundResource(R.drawable.edittext)
            }
        })



        back_button.setOnClickListener {
            finish()
        }


        //form validation
        Email.setText("")
        val emailPattern = ("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+").toRegex()

        submit_register.setOnClickListener {
            var email = Email.text.toString()

            if(email.isEmpty()){
                error_message2.visibility = View.VISIBLE
                Email.setBackgroundResource(R.drawable.edittexterror)
            }else if(email.trim().matches(emailPattern)){
                error_message2.visibility = View.GONE
                error_message.visibility = View.GONE
                Toast.makeText(applicationContext,"valid email address", Toast.LENGTH_SHORT).show()

            }else{
                Email.setBackgroundResource(R.drawable.edittexterror)
                error_message2.visibility = View.GONE
                error_message.visibility = View.VISIBLE
            }
        }
    }
    }

