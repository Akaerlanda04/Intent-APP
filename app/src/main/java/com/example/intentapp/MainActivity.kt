package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btMoveActivity.setOnClickListener(this)

        val btnMoveActivitywithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivitywithData.setOnClickListener(this)

        val btnMoveActivitywithObject: Button = findViewById(R.id.btn_move_activity_with_object)
        btnMoveActivitywithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       when (v?.id) {
           R.id.btn_move_activity -> {
               val moveIntent = Intent (this,MoveActivity::class.java)
               startActivity(moveIntent)
        }
           R.id.btn_move_activity_data -> {
              val moveIntentwithdata = Intent(this,MoveActivityWithData::class.java)
               moveIntentwithdata.putExtra(MoveActivityWithData.YOUR_NAME,"AKA ERLANDA")
               moveIntentwithdata.putExtra(MoveActivityWithData.YOUR_CLASS,"TI.20.B.1")
               moveIntentwithdata.putExtra(MoveActivityWithData.YOUR_AGE,21)
               startActivity(moveIntentwithdata)
           }
           R.id.btn_move_activity_with_object -> {
               val objectmhs = Mahasiswa (
                   "Aka Erlanda",
                   "TI.20.B.1",
                   21,
                   "akkaerlandale@gmail.com",
                   "Lubuk Kemang"
                       )
               val movewithObject = Intent(this, MoveActivityWithObject::class.java)
               movewithObject.putExtra(MoveActivityWithObject.EXTRA_MAHASISWA,objectmhs)
               startActivity(movewithObject)
           }
       }
    }
}