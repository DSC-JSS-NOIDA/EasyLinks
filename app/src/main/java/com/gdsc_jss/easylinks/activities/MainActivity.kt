package com.gdsc_jss.easylinks.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gdsc_jss.easylinks.R
import com.gdsc_jss.easylinks.fragments.ProfileFragment
import com.gdsc_jss.easylinks.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, ProfileFragment())
            .commit()

        val navigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view);
        navigationView.setOnNavigationItemSelectedListener{
            loadFragment(it.itemId)
            true
        }
    }

    private fun loadFragment(itemId: Int) {
        val tag = itemId.toString()
        val fragment = supportFragmentManager.findFragmentByTag(tag) ?: when (itemId) {
            R.id.search -> {
                SearchFragment()
            }
            R.id.profile -> {
                ProfileFragment()
            }
            else -> {
                null
            }
        }
        // replace fragment
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, fragment, tag)
                .commit()
        }
    }
}

