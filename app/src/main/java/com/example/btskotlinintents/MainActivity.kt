package com.example.btskotlinintents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val id: Int = 10
    val language: String = "kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val explicitButton = findViewById<Button>(R.id.button_explicit)

        explicitButton.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }


        val implicitButton = findViewById<Button>(R.id.button_implicit)
        implicitButton.setOnClickListener {
            //TODO: Implement explicit intent to open the web browser to a designated page.
//            intent = Intent...
        }
    }
}