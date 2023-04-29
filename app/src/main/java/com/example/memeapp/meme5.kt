package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5 : AppCompatActivity() {
    lateinit var button7: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button7 = findViewById(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
        }
    }
}