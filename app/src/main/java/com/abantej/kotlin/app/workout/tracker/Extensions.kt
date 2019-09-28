package com.abantej.kotlin.app.workout.tracker

import android.app.Activity
import android.content.Context
import android.widget.Adapter
import android.widget.Toast
import com.abantej.kotlin.app.workout.tracker.activity.HobbiesActivity

fun Context.showToast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}