package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val luckyNumber = 4
        var message=""
        when (diceRoll) {
            //if the luckuNumber == rollResult print You won
            luckyNumber -> message="You won!"
            //if the 1 == rollResult print So sorry! You rolled a 1. Try again!
            1 -> message="So sorry! You rolled a 1. Try again!"
            2 -> message="Sadly, you rolled a 2. Try again!"
            3 -> message="Unfortunately, you rolled a 3. Try again!"
            4 -> message="No luck! You rolled a 4. Try again!"
            5 -> message="Don't cry! You rolled a 5. Try again!"
            6 -> message="Apologies! you rolled a 6. Try again!"
        }
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = message
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}