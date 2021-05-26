package com.cooldevs.carent.Adapters

import android.content.Context
import android.media.Ringtone
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cooldevs.carent.R
import com.cooldevs.carent.VehicleType
import kotlinx.android.synthetic.main.car_list.view.*


class CarAdapter(val context: Context, val car:List<VehicleType>,val itemClick : (VehicleType) -> Unit) : RecyclerView.Adapter<CarAdapter.CarHolder> (){



    inner class CarHolder(itemView: View, val itemClick: (VehicleType) -> Unit) : RecyclerView.ViewHolder(itemView){

        val carImage= itemView?.findViewById<ImageView>(R.id.carImage)
        val carName =itemView?.findViewById<TextView>(R.id.carName)
        val carPrice = itemView?.findViewById<TextView>(R.id.carPrice)
    val carBtn = itemView?.findViewById<Button>(R.id.buttonCar)
        fun bindCar(car: VehicleType,context: Context){
            val resourceID = context.resources.getIdentifier(car.image, "drawable",context.packageName)
            carImage?.setImageResource(resourceID)
            carName.text = car.title
            carPrice.text = car.price
            carBtn.setOnClickListener{itemClick (car)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.car_list,parent,false)
        return CarHolder(view,itemClick)

    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {


        holder?.bindCar(car[position],context)
    }

    override fun getItemCount(): Int {
        return car.count()
    }
}