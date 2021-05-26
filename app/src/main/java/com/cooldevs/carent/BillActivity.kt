package com.cooldevs.carent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cooldevs.carent.Utilities.EXTRA_CARNAME
import com.cooldevs.carent.Utilities.EXTRA_CARPRICE
import kotlinx.android.synthetic.main.activity_bill.*

class BillActivity : AppCompatActivity() {
    var num=0
    var name = ""
    var rate = ""
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

    fun displayn(num:Int){
        numDisplay.setText( "" + num)
        var total = 0
        total = num * rate.toInt()
        billTotal.setText("Total Amount : ₹" + total)
    }
}