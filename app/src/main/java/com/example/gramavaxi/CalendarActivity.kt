package com.example.gramavaxi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This tells the app to show your new calendar design!
        setContentView(R.layout.activity_calendar)
    }
}