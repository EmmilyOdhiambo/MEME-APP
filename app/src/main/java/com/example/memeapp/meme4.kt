package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme4 : AppCompatActivity() {
    lateinit var button5: TextView
    lateinit var button6: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        button5= findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, meme3::class.java)
            startActivity(intent)
        }
        button6=findViewById(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this, meme5::class.java)
            startActivity(intent)
        }
    }
}