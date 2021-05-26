package com.cooldevs.carent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.cooldevs.carent.Adapters.CarAdapter
import com.cooldevs.carent.Utilities.EXTRA_CARNAME
import com.cooldevs.carent.Utilities.EXTRA_CARPRICE
import kotlinx.android.synthetic.main.activity_car.*

class CarActivity : AppCompatActivity() {

    lateinit var adapter: CarAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

adapter=CarAdapter(this,DataService.cars){car ->
    val billIntent= Intent(this, BillActivity::class.java)
    billIntent.putExtra(EXTRA_CARNAME,car.title)
    billIntent.putExtra(EXTRA_CARPRICE,car.priceint.toString())
    startActivity((billIntent))
    //println(car.title)

}
        val layoutManager = GridLayoutManager(this,2)
        carListView.layoutManager = layoutManager
        carListView.adapter = adapter

    }
}