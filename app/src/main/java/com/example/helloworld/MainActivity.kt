package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var increment = findViewById<Button>(R.id.btn_increment)
        var displayText = findViewById<TextView>(R.id.tv_increment)
        var increaseNumber = 0
        btn_increment.setOnClickListener {
            increaseNumber++
            displayText.text = increaseNumber.toString()
        }

    }

}