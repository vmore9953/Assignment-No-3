package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Retrieve data from Intent
        val string1 = intent.getStringExtra("string1")
        val string2 = intent.getStringExtra("string2")
        val string3 = intent.getStringExtra("string3")
        val string4 = intent.getStringExtra("string4")
        val string5 = intent.getStringExtra("string5")
        val booleanValue = intent.getBooleanExtra("booleanKey", false)
        val integerValue = intent.getIntExtra("integerKey", 0)
        val floatValue = intent.getFloatExtra("floatKey", 0.0f)

        // Display data in TextView
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = """
            String1: $string1
            String2: $string2
            String3: $string3
            String4: $string4
            String5: $string5
            Boolean: $booleanValue
            Integer: $integerValue
            Float: $floatValue
        """.trimIndent()

        // Log data
        Log.d("SecondActivity", "Received Data: $string1, $string2, $booleanValue, $integerValue, $floatValue")

        // Button to send combined data to ThirdActivity
        findViewById<Button>(R.id.button2).setOnClickListener {
            val combinedData = "$string1 $string2 $string3 $string4 $string5 Boolean: $booleanValue Integer: $integerValue Float: $floatValue"
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("finalData", combinedData)
            startActivity(intent)
        }
    }
}
