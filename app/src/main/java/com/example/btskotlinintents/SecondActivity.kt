package com.example.btskotlinintents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val id = bundle?.get("id_value")
        val language = bundle?.get("language_value")

        val backButton = findViewById<Button>(R.id.back_button)

        Toast.makeText(applicationContext, id.toString() + " " + language, Toast.LENGTH_LONG).show()
        backButton.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}