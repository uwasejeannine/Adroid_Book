package com.example.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourthRupper : AppCompatActivity() {
    lateinit var btnPrevPage3: Button
    lateinit var btnNextPage4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_rupper)
        clickNext()
        clickPrev()
    }

    fun clickNext() {
        btnNextPage4 = findViewById(R.id.btnNextPage4)
        btnNextPage4.setOnClickListener {
            val intent4 = Intent(baseContext, fith::class.java)
            startActivity(intent4)
        }
    }
        fun clickPrev() {
            btnPrevPage3 = findViewById(R.id.btnPrevPage3)
            btnPrevPage3.setOnClickListener {
                val intent5 = Intent(baseContext, ThirdRupper::class.java)
                startActivity(intent5)
            }
        }
    }
