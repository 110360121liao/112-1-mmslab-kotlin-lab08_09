package com.example.a112_1_mmslab_kotlin_lab08

import android.app.Service
import android.content.Intent
import android.os.IBinder


class MyService : Service() {
    override fun onCreate() {
        super.onCreate()
        Thread {
            try {
                Thread.sleep(5000)
                val intent = Intent(this@MyService, MainActivity2::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                this@MyService.startActivity(intent)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }.start()
        stopSelf()
    }

    override fun onStartCommand(intent: Intent, flags: Int, startID: Int): Int {
        super.onStartCommand(intent, flags, startID)
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder? {
        throw UnsupportedOperationException("Not yet implemented")
    }
}