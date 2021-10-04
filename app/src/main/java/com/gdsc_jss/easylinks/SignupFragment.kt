package com.gdsc_jss.easylinks

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class SignupFragment : Fragment() {

    private lateinit var loginBtn : TextView
    private lateinit var signup : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        loginBtn = view.findViewById(R.id.login)
        signup = view.findViewById(R.id.btnCreate)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginBtn.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, LoginFragment())
                ?.commit()
        }
        signup.setOnClickListener{
            startActivity(Intent(requireContext(), MainActivity::class.java))
        }
    }
}