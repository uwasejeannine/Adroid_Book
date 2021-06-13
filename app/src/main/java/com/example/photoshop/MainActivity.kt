package com.example.photoshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNextPage:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickNext()
    }
    fun clickNext(){
        btnNextPage=findViewById(R.id.btnNextPage)
        btnNextPage.setOnClickListener {
            val intent=Intent(baseContext,Second::class.java)
            startActivity(intent)

    }
}
}

