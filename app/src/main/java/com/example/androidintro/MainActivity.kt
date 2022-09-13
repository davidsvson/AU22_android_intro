package com.example.androidintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var inputView : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.nameView)
        inputView = findViewById(R.id.inputView)

        textView.text = "Susan"

        val button = findViewById<Button>(R.id.button)

        button.text = "Tryck här!"

    }

    fun buttonPressed(view : View) {
        val name = inputView.text.toString()

        textView.text = "Hej $name!!"
        Log.d("!!!", "Knappen trycktes")
    }


}









