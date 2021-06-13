package com.example.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdRupper : AppCompatActivity() {
    lateinit var btnPrevPage2: Button
    lateinit var btnNextPage3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_rupper)
        clickNext()
        clickPrev()
    }

    fun clickNext() {
        btnNextPage3= findViewById(R.id.btnNextPage3)
        btnNextPage3.setOnClickListener {
            val intent = Intent(baseContext, fourthRupper::class.java)
            startActivity(intent)
        }
    }

    fun clickPrev() {
        btnPrevPage2= findViewById(R.id.btnPrevPage2)
        btnPrevPage2.setOnClickListener {
            val intent = Intent(baseContext, Second::class.java)
            startActivity(intent)
        }
    }
}