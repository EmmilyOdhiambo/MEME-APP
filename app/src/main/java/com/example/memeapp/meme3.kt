package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme3 : AppCompatActivity() {
    lateinit var button3: TextView
    lateinit var button4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        button3= findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, meme2::class.java)
            startActivity(intent)
        }
        button4=findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
        }
    }
}