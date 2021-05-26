package com.cooldevs.carent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cooldevs.carent.Utilities.EXTRA_CARNAME
import com.cooldevs.carent.Utilities.EXTRA_CARPRICE
import kotlinx.android.synthetic.main.activity_bill.*
import kotlinx.android.synthetic.main.activity_booked.*

class BillActivity : AppCompatActivity() {
    var num=0
    var name = ""
    var rate = ""
    var bill= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)
        val name = intent.getStringExtra(EXTRA_CARNAME)
        val price =intent.getStringExtra(EXTRA_CARPRICE)
        //println(name)
        //println(price)
        if (price != null) {
            rate = price.toInt().toString()
        }
        billCarName.setText("Vehicle: ${name}")
        billCarRate.setText("Rate: ₹${price}/hr")



    }
    fun setText(){
println(billCarRate.text)
    }

    fun increaseInt(view: View){
        num += 1
        displayn(num)

    }

    fun  decreaseInt(view: View){
        num-=1
        displayn(num)
    }
    fun checkBill(){
        if(bill !=0) {
            payBtn.setOnClickListener {
                val payIntent = Intent(this, BookedActivity::class.java)
                startActivity(payIntent)
            }
        }
        else{
            payBtn.setOnClickListener{
                Toast.makeText(this, "Please enter no of Hrs", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun displayn(num:Int){
        numDisplay.setText( "" + num)
        var total = 0
        total = num * rate.toInt()
        bill = total
        billTotal.setText("Total Amount : ₹" + total)
        checkBill()
    }



}