package com.abantej.kotlin.app.workout.tracker.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abantej.kotlin.app.workout.tracker.Constants
import com.abantej.kotlin.app.workout.tracker.R
import com.abantej.kotlin.app.workout.tracker.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Safe Call ?.
        // Safe Call with let ?.let { }

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle?.getString(Constants.USER_MSG_KEY)
            showToast(msg)
            txvUserMessage.text = msg
        }
    }
}