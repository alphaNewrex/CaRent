package com.cooldevs.carent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val PimpriGaon = LatLng(18.6090,73.8005 )//Pimpri Gaon Bus stop
        val PimpleSaudagar = LatLng(18.5987, 73.7978)//Rahatni Bus Stop
        val Nigdi = LatLng(18.6492, 73.7707)//Nigdi Bus Stop
        val Kothrud = LatLng(18.5074, 73.8077)//Kothrud bus stop
        val Aundh = LatLng(18.5602, 73.8031)//Aundh Bus stop
        val Ravet = LatLng(18.6606, 73.7322)//Ravet bus stop
        val PimpleNilakh = LatLng(18.5790, 73.7860)//pimple nilakh bus stop
        val Chinchwad = LatLng(18.6298, 73.7997)//chinchwad bus stop
        mMap.addMarker(MarkerOptions().position(PimpriGaon).title("Marker in PimpriGaon"))
        mMap.addMarker(MarkerOptions().position(PimpleSaudagar).title("Marker in Pimple Saudagar"))
        mMap.addMarker(MarkerOptions().position(Nigdi).title("Marker in Nigdi"))
        mMap.addMarker(MarkerOptions().position(Kothrud).title("Marker in Kothrud"))
        mMap.addMarker(MarkerOptions().position(Aundh).title("Marker in Aundh"))
        mMap.addMarker(MarkerOptions().position(Ravet).title("Marker in Ravet"))
        mMap.addMarker(MarkerOptions().position(PimpleNilakh).title("Marker in Pimple Nilakh"))
        mMap.addMarker(MarkerOptions().position(Chinchwad).title("Marker in Chinchwad"))
    }

}