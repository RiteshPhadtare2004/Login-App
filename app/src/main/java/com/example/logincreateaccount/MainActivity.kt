package com.example.logincreateaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var cAccountButton: TextView
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)

        login.setOnClickListener{
            loginAccount()
        }

    }

    private fun loginAccount() {
        val user: String = "GDSC"
        val pass: String = "3dcollab"

        if (user == username.text.toString() && pass == password.text.toString()){
            showToast("Successful Login")
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }else{
            showToast("Invalid username or password")
        }
    }


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}