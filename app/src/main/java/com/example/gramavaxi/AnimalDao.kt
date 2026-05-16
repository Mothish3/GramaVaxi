package com.example.gramavaxi

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnimalDao {
    @Insert
    suspend fun insert(animal: Animal)

    @Query("SELECT * FROM animal_table")
    suspend fun getAllAnimals(): List<Animal>
}
