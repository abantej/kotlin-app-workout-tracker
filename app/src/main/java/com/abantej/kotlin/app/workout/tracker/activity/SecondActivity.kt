package com.abantej.kotlin.app.workout.tracker.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abantej.kotlin.app.workout.tracker.R
import com.abantej.kotlin.app.workout.tracker.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("userMessage")

        showToast(msg)

        txvUserMessage.text = msg
    }
}