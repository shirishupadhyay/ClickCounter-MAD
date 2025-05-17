package com.example.clickcounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val increaseButton = findViewById<Button>(R.id.increaseButton)

        increaseButton.setOnClickListener {
            count++
            counterText.text = count.toString()
        }
    }
}
