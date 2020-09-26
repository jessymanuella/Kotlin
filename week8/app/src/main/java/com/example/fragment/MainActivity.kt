package com.example.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
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
            intent = Intent(this,MainFragment::class.java)
            startActivity(intent)
        }
        btn_drawable.setOnClickListener{
            intent = Intent(this,Scorekeeper::class.java)
            startActivity(intent)
        }
        btn_recycler.setOnClickListener{
            intent = Intent(this,RecyclerListUsers::class.java)
            startActivity(intent)
        }


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        val nightMode = AppCompatDelegate.getDefaultNightMode()
        when(nightMode){
            AppCompatDelegate.MODE_NIGHT_YES-> menu.findItem(R.id.night_mode).setTitle(R.string.day_mode)
            else ->  menu.findItem(R.id.night_mode).setTitle(R.string.night_mode)
        }
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.night_mode) {
            val nightMode = AppCompatDelegate.getDefaultNightMode()
            if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            recreate()
        }

        return true
    }




}