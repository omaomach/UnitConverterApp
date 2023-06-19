package com.omao.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1:EditText = findViewById(R.id.et1)
        val btn1:Button = findViewById(R.id.btn1)
        val tv1:TextView = findViewById(R.id.tv1)

        btn1.setOnClickListener() {
            val userInput: Double = et1.text.toString().toDouble()
            tv1.text = ""+ convertToPounds(userInput)+"Pounds"
        }

    }

    fun convertToPounds(kilos: Double): Double {
        return kilos * 2.20462
    }

}