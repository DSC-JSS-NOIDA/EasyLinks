package com.gdsc_jss.easylinks.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.gdsc_jss.easylinks.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(applicationContext, AuthActivity::class.java)
                startActivity(intent)
                finish()
            },
            2000L
        )
    }
}