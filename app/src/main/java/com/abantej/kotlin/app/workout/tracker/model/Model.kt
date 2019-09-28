package com.abantej.kotlin.app.workout.tracker.model

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf(
        Hobby("Gaming"),
        Hobby("Exercising"),
        Hobby("Programming"),
        Hobby("Reading"),
        Hobby("Working"),
        Hobby("Sleeping"),
        Hobby("Eating"),
        Hobby("Surfing"),
        Hobby("Watching movies"),
        Hobby("Cycling")
    )
}