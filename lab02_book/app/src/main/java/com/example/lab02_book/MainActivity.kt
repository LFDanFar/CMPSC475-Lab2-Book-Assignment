package com.example.lab02_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTrue = findViewById(R.id.buttonTrue) as Button
        val buttonFalse = findViewById(R.id.buttonFalse) as Button
        buttonTrue.setOnClickListener{
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
        }
        buttonFalse.setOnClickListener{
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show()
        }
    }
}
