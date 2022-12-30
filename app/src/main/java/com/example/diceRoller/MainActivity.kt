package com.example.diceRoller

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton = findViewById<Button>(R.id.RollButton)
        rollButton.setOnClickListener {rollDice()}

        }

    private fun rollDice() {
        val randomInt = (1..6).random()
        Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT). show()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6 }
        val diceImage: ImageView = findViewById(R.id.DiceResult)
        diceImage.setImageResource(drawableResource)
        val dice_result: TextView = findViewById(R.id.Numeric_result)
        dice_result.visibility= View.VISIBLE
        dice_result.text= randomInt.toString()
        }
}