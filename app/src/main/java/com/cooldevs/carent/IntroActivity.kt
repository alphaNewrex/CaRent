package com.cooldevs.carent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro.*
import kotlinx.android.synthetic.main.activity_signup.*

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        bookLoginBtn.setOnClickListener{
            val loginIntent= Intent(this, LoginActivity::class.java)
            startActivity((loginIntent))

        }
    }
}