package com.example.custom_notficationes

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class App : Application() {
    override fun onCreate() {
        super.onCreate()

    }

    // We will check android versiones is >= 26 or not which is our android oreo
    // we will create at least one channel for custom notificationes

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                    CHANNEL_ID,
                    "Example Channel",
                    NotificationManager.IMPORTANCE_HIGH
            )

            val manager = getSystemService<NotificationManager>(NotificationManager::class.java!!)
            manager!!.createNotificationChannel(channel)
        }
    }

    companion object {

        val CHANNEL_ID = "exampleChannel"
    }
}
