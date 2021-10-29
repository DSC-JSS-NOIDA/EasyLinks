package com.gdsc_jss.easylinks.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gdsc_jss.easylinks.R
import com.gdsc_jss.easylinks.activities.EditProfileActivity
import com.gdsc_jss.easylinks.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)

        setClicks()

        return binding.root
    }

    private fun setClicks() {
        binding.editProfile.setOnClickListener {
            activity?.startActivity(Intent(context,EditProfileActivity::class.java))
        }
    }
}