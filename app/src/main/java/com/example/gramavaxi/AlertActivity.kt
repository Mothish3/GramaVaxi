package com.example.gramavaxi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        // Find the text box and button
        val etSymptoms = findViewById<EditText>(R.id.etSymptoms)
        val btnSendAlert = findViewById<Button>(R.id.btnSendAlert)

        // What happens when the Send button is clicked
        btnSendAlert.setOnClickListener {
            val symptoms = etSymptoms.text.toString()

            if (symptoms.isEmpty()) {
                Toast.makeText(this, "Please describe the symptoms first", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Alert sent to the local Vet!", Toast.LENGTH_LONG).show()
                finish() // Closes this screen and goes back to the main menu
            }
        }
    }
}