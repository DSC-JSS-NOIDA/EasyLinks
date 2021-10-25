package com.gdsc_jss.easylinks.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.gdsc_jss.easylinks.R
import android.view.animation.AnimationUtils

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashImage = findViewById<ImageView>(R.id.splash_image)
        val anim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        splashImage.startAnimation(anim)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(applicationContext, AuthActivity::class.java)
            startActivity(intent)
            finish()
        },
            2000L
        )
    }
}