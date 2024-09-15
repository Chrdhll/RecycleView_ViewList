package com.fadhil.a27_08_24

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {

    private lateinit var etusername : EditText
    private lateinit var etpassword : EditText
    private lateinit var btnlogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        etpassword=findViewById(R.id.etPassword)
        etusername=findViewById(R.id.etUsername)
        btnlogin=findViewById(R.id.btnLogin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnlogin.setOnClickListener(){
            var intent = Intent(this,WelcomeActivity::class.java)
            val nUsername =etusername.text.toString()
            val nPassword =etpassword.text.toString()

            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)
            Log.d("Username : ", nUsername)
            Log.d("Password : ", nPassword)
            startActivity(intent)

        }
    }
}