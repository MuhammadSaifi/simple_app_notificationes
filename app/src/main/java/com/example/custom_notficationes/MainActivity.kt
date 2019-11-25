package com.example.custom_notficationes

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

import android.app.Notification
import android.os.Bundle
import android.view.View
import com.example.custom_notficationes.App.Companion.CHANNEL_ID

// it will show simple notification
// that type of notification can be useable in any type of App
// but it will again work in above android oreo versiones
// here again i have use channel so for that i have maked App.kt in which i create channel
class MainActivity : AppCompatActivity() {
    private var notificationManager: NotificationManagerCompat? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationManager = NotificationManagerCompat.from(this)
    }
// below function is our  button on click functiones
    // when our button clicked then this functione will be called and execute our code
    fun showNotification(v: View) {

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Title")
                .setContentText("This is title")
                .setAutoCancel(true)
                .setOnlyAlertOnce(true)
                .build()
        notificationManager!!.notify(1, notification)

    }
}
