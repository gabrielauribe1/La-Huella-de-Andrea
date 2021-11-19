package com.example.lahuelladeandrea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginhomedirect = findViewById<Button>(R.id.login2)
        loginhomedirect.setOnClickListener{val intent = Intent(this,HomePage1::class.java)
            startActivity(intent)}
    }
}