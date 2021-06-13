package com.example.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second : AppCompatActivity() {
    lateinit var btnPrevPage: Button
    lateinit var btnNextPage2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        clickNext()
        clickPrevious()
    }

    fun clickNext() {
        btnNextPage2=findViewById(R.id.btnNexPage2)
        btnNextPage2.setOnClickListener {
            val intent = Intent(baseContext, ThirdRupper::class.java)
            startActivity(intent)

        }
    }
    fun clickPrevious(){
        btnPrevPage=findViewById(R.id.btnNextPage)
        btnPrevPage.setOnClickListener {
            val intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }
        }
    }
