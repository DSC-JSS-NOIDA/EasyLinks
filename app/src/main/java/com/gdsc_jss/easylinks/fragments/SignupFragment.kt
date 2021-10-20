package com.gdsc_jss.easylinks.fragments

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gdsc_jss.easylinks.activities.MainActivity
import com.gdsc_jss.easylinks.R
import com.gdsc_jss.easylinks.databinding.FragmentSignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException

class SignupFragment : Fragment() {

    private var binding: FragmentSignupBinding? = null
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater, container, false)

        val paint = binding!!.signupLabel.paint
        val width = paint.measureText(binding!!.signupLabel.text.toString())
        val textShader: Shader = LinearGradient(0f, 0f, width, binding!!.signupLabel.textSize, intArrayOf(
            Color.parseColor("#3070F0"),
            Color.parseColor("#2ABED8")
        ), null, Shader.TileMode.CLAMP)


        binding!!.signupLabel.paint.setShader(textShader)
        binding!!.footer.paint.setShader(textShader)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()

        binding?.login?.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, LoginFragment())
                ?.commit()
        }
        binding?.btnCreate?.setOnClickListener{
            val email = binding?.emailSignup?.text.toString()
            val password = binding?.passwordSignup?.text.toString()
            if (validation(email, password)) {
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(requireActivity()) {
                    if (it.isSuccessful) {
                        Toast.makeText(context, "Success SignUp", Toast.LENGTH_SHORT).show()
                    } else {
                        try {
                            throw it.exception!!
                        } catch (e: FirebaseAuthWeakPasswordException) {
                            Toast.makeText(context, "Password too simple", Toast.LENGTH_SHORT)
                                .show()
                        } catch (e: FirebaseAuthInvalidCredentialsException) {
                            Toast.makeText(context, "Email is not valid", Toast.LENGTH_SHORT).show()
                        } catch (e: FirebaseAuthUserCollisionException) {
                            Toast.makeText(
                                context,
                                "Email already used",
                                Toast.LENGTH_SHORT
                            ).show()
                        } catch (e: Exception) {
                            Toast.makeText(
                                context,
                                "failed signup",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }

            startActivity(Intent(requireContext(), MainActivity::class.java))
        }
    }

    private fun validation(
        email: String,
        password: String
    ): Boolean = when {
        TextUtils.isEmpty(email) -> {
            Toast.makeText(context, "Email cant be empty", Toast.LENGTH_SHORT).show()
            false
        }
        TextUtils.isEmpty(password) -> {
            binding?.passwordSignup?.error = "password empty"
            Toast.makeText(context, "Password cant be empty", Toast.LENGTH_SHORT).show()
            false
        }
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
            Toast.makeText(context, "isn't email format", Toast.LENGTH_SHORT).show()
            false
        }
        else -> true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
