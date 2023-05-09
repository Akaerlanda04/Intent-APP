package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivityWithData : AppCompatActivity() {
    companion object{
        const val YOUR_NAME = "your_name"
        const val YOUR_CLASS = "your_name"
        const val YOUR_AGE = "your_Age"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceiver: TextView= findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(YOUR_NAME)
        val clas = intent.getStringExtra(YOUR_CLASS)
        val age = intent.getIntExtra(YOUR_AGE,0)

        val text = "Your name : $name, Your class : $clas, Your Age : $age"

        tvDataReceiver.text = text
    }
}