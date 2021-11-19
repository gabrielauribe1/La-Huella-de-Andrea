package com.example.lahuelladeandrea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        settingsActionBar()

        val loginhomedirect = findViewById<Button>(R.id.login2)
        loginhomedirect.setOnClickListener{val intent = Intent(this,HomePage1::class.java)
            startActivity(intent)}
    }

    // Configura el actionBar con un nuevo título y la posibilidad para poder de regresar al Main Activity.
    private fun settingsActionBar() {
        val actionBar = supportActionBar
        actionBar?.title = "Login"
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Habilita la opción de poder regresar al MainActivity.
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}