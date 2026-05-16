package com.example.gramavaxi

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animal_table")
data class Animal(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val breed: String,
    val age: String
)
