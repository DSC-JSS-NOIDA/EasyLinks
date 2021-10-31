package com.gdsc_jss.easylinks.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.gdsc_jss.easylinks.activities.MainActivity
import com.gdsc_jss.easylinks.R
import com.gdsc_jss.easylinks.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.oAuthCredential


class LoginFragment : Fragment() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        auth = FirebaseAuth.getInstance()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setClicks()

    }


    private fun setClicks() {
        binding.btnSignup.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, SignupFragment())
                ?.commit()
        }


        binding.btnLogin.setOnClickListener {
            if (binding.email.text.toString().isNullOrEmpty()) {
                binding.email.error = "Email cannot be empty"
            } else if (binding.password.text.toString().isNullOrEmpty()) {
                binding.password.error = "Password cannot be empty"
            } else {
                binding.progressBar.visibility=View.VISIBLE

                auth.signInWithEmailAndPassword(
                    binding.email.text.toString(),
                    binding.password.text.toString()
                ).addOnCompleteListener {
                    binding.progressBar.visibility=View.GONE
                    if (it.isSuccessful) {
                        openMainActivity()
                    } else {
                        Toast.makeText(
                            context,
                            "invalid credentials. Try again!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

            }
        }

    }

    private fun openMainActivity() {
        Toast.makeText(requireContext(), "Welcome!", Toast.LENGTH_SHORT).show()
        startActivity(Intent(requireContext(), MainActivity::class.java))
        activity?.finish()
    }
}


