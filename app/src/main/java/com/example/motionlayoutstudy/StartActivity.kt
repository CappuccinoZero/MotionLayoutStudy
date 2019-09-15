package com.example.motionlayoutstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        first.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }
        second.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

        thread.setOnClickListener {
            startActivity(Intent(this,ThreadActivity::class.java))
        }

        fourth.setOnClickListener {
            startActivity(Intent(this,Fourthctivity::class.java))
        }
    }
}
