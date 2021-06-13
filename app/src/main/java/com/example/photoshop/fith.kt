package com.example.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class fith : AppCompatActivity() {
    lateinit var btnButton9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fith)
        castView()
        clickPrev()
    }
    fun castView(){
        btnButton9=findViewById(R.id.btnbutton9)
    }
    fun clickPrev(){
        btnButton9.setOnClickListener {
        val intent=Intent(baseContext,fourthRupper::class.java)
            startActivity(intent)
    }
}
}