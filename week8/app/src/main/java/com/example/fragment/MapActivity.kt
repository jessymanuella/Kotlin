package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        val first = MapsFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.map, first)
            commit()
        }
    }
}