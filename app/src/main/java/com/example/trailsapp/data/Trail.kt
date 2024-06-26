package com.example.trailsapp.data

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

data class Trail(
    val id: Int,
    val name: String,
    val description: String,
    val distance: String?,
    val startLocation: String?,
    val stopLocation: String?,
    val elevation: Int?,
    val difficulty: Difficulty?,
    val longDescription: String?,
    val time: String?,
    val imageUrl: String?
)