package com.example.drawingnumber

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun drawnNumber(){
        val resultText  = findViewById<TextView>(R.id.result)
        val number = Random().nextInt(11)
        resultText.text = "$number"
    }
}