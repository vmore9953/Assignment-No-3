package com.example.assignment3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Retrieve the combined data from Intent
        val finalData = intent.getStringExtra("finalData")

        // Display data in TextView
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = finalData
    }
}
