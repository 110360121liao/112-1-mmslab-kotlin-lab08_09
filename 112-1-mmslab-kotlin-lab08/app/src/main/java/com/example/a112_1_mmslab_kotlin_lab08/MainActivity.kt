package com.example.a112_1_mmslab_kotlin_lab08

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, MyService::class.java)
            startService(intent)
            Toast.makeText(this@MainActivity, "Service ! 啟動 !!", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}