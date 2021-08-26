package com.example.statechanges

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textBox = findViewById<TextView>(R.id.textView)
        textBox.text = "App started."
    }

    @SuppressLint("SetTextI18n")
    override fun onRestart() {
        super.onRestart()
        val textBox = findViewById<TextView>(R.id.textView)
        textBox.text = "you left the app. Welcome back!"
    }

    @SuppressLint("SetTextI18n")
    override fun onPause() {
        super.onPause()
        val textBox = findViewById<TextView>(R.id.textView)
        textBox.text = "The app is paused."
    }
}