package com.hfad.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var hello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello = findViewById<TextView>(R.id.hello)
        hello.text = savedInstanceState?.getCharSequence("hello")?:"Hello"

        findViewById<Button>(R.id.button).setOnClickListener {
            val name = findViewById<EditText>(R.id.edit_text)
            hello.text = "Hello ${name.text}"
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        savedInstanceState.putCharSequence("hello", hello.text)
        super.onSaveInstanceState(savedInstanceState)
    }
}