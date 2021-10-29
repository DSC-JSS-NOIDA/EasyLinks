package com.gdsc_jss.easylinks.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gdsc_jss.easylinks.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}