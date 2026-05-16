package com.example.gramavaxi

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class CampAlertWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        showNotification()
        return Result.success()
    }

    private fun showNotification() {
        val channelId = "grama_vaxi_alerts"
        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Create the notification channel for modern Android versions (API 26+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Grama-Vaxi Camp Alerts",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Emergency alerts for upcoming livestock vaccination camps"
            }
            notificationManager.createNotificationChannel(channel)
        }

        // Build the loud text alert for the farmer
        val notification = NotificationCompat.Builder(applicationContext, channelId)
            .setSmallIcon(android.R.drawable.ic_dialog_info) // Standard built-in system icon
            .setContentTitle("Grama-Vaxi Alert! 📢")
            .setContentText("Doctor arriving at Temple Square tomorrow. Bring your animals!")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .build()

        // Display the notification on screen
        notificationManager.notify(1, notification)
    }
}