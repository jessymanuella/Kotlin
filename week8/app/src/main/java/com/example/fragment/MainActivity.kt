package com.example.fragment

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val firstFragment= MyFragment()
        btnSecondA.setOnClickListener {
           intent = Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }
        btn_launch.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
            }
        }

    }
}