package com.gdsc_jss.easylinks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginSignupActivity : AppCompatActivity() {
    val fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup)

        fragmentManager.beginTransaction().replace(R.id.fragment_container, LoginFragment()).commit()

    }
}