package com.example.studentmarkscalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class calculater : AppCompatActivity() {

    val mainfragment = MainFragment()
    val calfragment = calculater()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculater)

        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)

        btn2.setOnClickListener {

        }

        btn3.setOnClickListener {

        }

    }
}