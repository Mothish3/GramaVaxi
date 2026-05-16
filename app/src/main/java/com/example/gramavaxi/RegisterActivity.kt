package com.example.gramavaxi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    // A simple, fast memory storage list that takes zero processing power
    companion object {
        val registeredAnimalsList = ArrayList<String>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etBreed = findViewById<EditText>(R.id.etBreed)
        val etAge = findViewById<EditText>(R.id.etAge)
        val btnSave = findViewById<Button>(R.id.btnSaveAnimal)

        btnSave.setOnClickListener {
            val breed = etBreed.text.toString().trim()
            val age = etAge.text.toString().trim()

            if (breed.isEmpty() || age.isEmpty()) {
                Toast.makeText(this, "Please fill in all details", Toast.LENGTH_SHORT).show()
            } else {
                // Instantly save to memory without using the database background thread
                val animalData = "Breed: $breed, Age: $age months"
                registeredAnimalsList.add(animalData)

                // Show success message and exit immediately
                Toast.makeText(this, "Saved $breed to Animal Ledger!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}