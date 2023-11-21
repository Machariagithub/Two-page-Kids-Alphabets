package com.example.kidplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickLogin = findViewById<Button>(R.id.loginbtn)
        clickLogin.setOnClickListener {
            val intent = Intent(this, ::class.java)
            startActivity(intent)
        }
        val clickLogin = findViewById<Button>(R.id.loginbtn)
        clickLogin.setOnClickListener {
            val intent = Intent(this, kidsdashboard::class.java)
            startActivity(intent)
        }
    }
}