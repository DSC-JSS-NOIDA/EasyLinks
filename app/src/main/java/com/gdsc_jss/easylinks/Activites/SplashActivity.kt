package com.gdsc_jss.easylinks.Activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.gdsc_jss.easylinks.R

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME = 1500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
           val intent = Intent(applicationContext, LoginSignupActivity::class.java)
           startActivity(intent)
            finish()
        }, SPLASH_TIME.toLong())
    }
}