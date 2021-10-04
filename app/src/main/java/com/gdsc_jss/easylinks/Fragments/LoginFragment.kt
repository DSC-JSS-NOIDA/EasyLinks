package com.gdsc_jss.easylinks.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.gdsc_jss.easylinks.Activites.MainActivity
import com.gdsc_jss.easylinks.R


class LoginFragment : Fragment() {

    private lateinit var signUpBtn : TextView
    private lateinit var loginBtn : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        signUpBtn = view.findViewById(R.id.btnSignup)
        loginBtn = view.findViewById(R.id.btnLogin)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signUpBtn.setOnClickListener{
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, SignupFragment())
                ?.commit()
        }
        loginBtn.setOnClickListener{
            startActivity(Intent(requireContext(), MainActivity::class.java))
        }
    }
}