package com.abantej.kotlin.app.workout.tracker.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abantej.kotlin.app.workout.tracker.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("userMessage")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txvUserMessage.text = msg
    }
}