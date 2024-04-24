package com.getir.patika.finalproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val splashDelay: Long = 3000 // The delay time in milliseconds.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler(mainLooper).postDelayed({
            // Start home activity
            startActivity(Intent(this, HomePage::class.java))
            // close splash activity
            finish()
        }, splashDelay)
    }
}