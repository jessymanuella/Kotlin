package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class Scorekeeper() : AppCompatActivity() {
    var mScore1: Int=0
    var mScore2: Int =0
     val STATE_SCORE_1 = "Team 1 Score"
     val STATE_SCORE_2 = "Team 1 Score"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scorekeeper)

        val mScoreText = findViewById<TextView>(R.id.score_1)
        val mScoreText2 = findViewById<TextView>(R.id.score_2)
        if (savedInstanceState != null) {
            mScore1 = savedInstanceState.getInt(STATE_SCORE_1)
            mScore2 = savedInstanceState.getInt(STATE_SCORE_2)
            //Set the score text views
            mScoreText.setText(mScore1.toString())
            mScoreText2.setText(mScore2.toString())
        }
    }




     override fun onSaveInstanceState(outState: Bundle) {
         outState.putInt(STATE_SCORE_1,mScore1)
         outState.putInt(STATE_SCORE_2,mScore2)
         super.onSaveInstanceState(outState)
     }
    fun decreaseScore(view: View) {
        print(view.id)
        print(R.id.decreaseTeam1)
        when(view.id)
        {
            R.id.decreaseTeam1 ->{

                mScore1--
                val mScoreText: TextView?
                mScoreText = findViewById<TextView>(R.id.score_1)
                mScoreText.setText(mScore1.toString())
            }
            R.id.decreaseTeam2 ->{
                mScore2--
                val mScoreText2 = findViewById<TextView>(R.id.score_2)
                mScoreText2.setText(mScore2.toString())
            }
        }
    }
    fun increaseScore(view: View) {

        when(view.id)
        {
            R.id.increaseTeam1 ->{
                mScore1++
                val mScoreText = findViewById<TextView>(R.id.score_1)
                mScoreText.setText(mScore1.toString())
            }
            R.id.increaseTeam2 ->{
                mScore2++
                val mScoreText2 = findViewById<TextView>(R.id.score_2)
                mScoreText2.setText(mScore2.toString())
            }
        }
    }
}