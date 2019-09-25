package com.abantej.kotlin.app.workout.tracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowWorkouts.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            // explicit intent
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("userMessage", message)

            startActivity(intent)
        }
    }
}
