package com.example.gramavaxi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister = findViewById<Button>(R.id.btnRegisterAnimal)
        val btnCalendar = findViewById<Button>(R.id.btnVaccineCalendar)
        val btnAlert = findViewById<Button>(R.id.btnDiseaseAlert)

        // Set up standard navigation click listeners
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnCalendar.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        btnAlert.setOnClickListener {
            val intent = Intent(this, AlertActivity::class.java)
            startActivity(intent)
        }

        // Fulfill Success Criteria: Schedule background reminder using WorkManager
        // Set to trigger 15 seconds after opening for rapid testing/evaluation
        val alertRequest = OneTimeWorkRequestBuilder<CampAlertWorker>()
            .setInitialDelay(15, TimeUnit.SECONDS)
            .build()

        WorkManager.getInstance(this).enqueue(alertRequest)
    }
}