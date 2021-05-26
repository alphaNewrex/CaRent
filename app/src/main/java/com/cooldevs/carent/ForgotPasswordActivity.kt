package com.cooldevs.carent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        auth = FirebaseAuth.getInstance()

        back_btn.setOnClickListener {
            finish()
    }
    reset_pass_btn.setOnClickListener{
        var email: String = email_edt_text.text.toString()
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please enter email id", Toast.LENGTH_SHORT).show()
        }
        else{
            auth.sendPasswordResetEmail(email)
                    .addOnCompleteListener(this, OnCompleteListener { task ->
                        if(task.isSuccessful){
                            Toast.makeText(this, "Reset link sent to your email", Toast.LENGTH_SHORT).show()

                        }
                        else
                        {
                            Toast.makeText(this,"Unable to send Reset mail",Toast.LENGTH_SHORT).show()
                        }
                    })
        }
    }
}
}