package com.cooldevs.carent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextBtn.setOnClickListener{
            val introIntent = Intent(this, IntroActivity::class.java )
            startActivity(introIntent)
        }
    }
}