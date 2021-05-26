package com.cooldevs.carent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_booked.*

class BookedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booked)
        anotherBtn.setOnClickListener{
            val anotherIntent = Intent(this, CarActivity::class.java )
            startActivity(anotherIntent)
        }
    }


}