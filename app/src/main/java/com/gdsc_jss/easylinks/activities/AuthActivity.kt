package com.gdsc_jss.easylinks.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gdsc_jss.easylinks.fragments.LoginFragment
import com.gdsc_jss.easylinks.R

class AuthActivity : AppCompatActivity() {
    val fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup)

        fragmentManager.beginTransaction().replace(R.id.fragment_container, LoginFragment()).commit()

    }
}