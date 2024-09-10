package com.example.tugas3registrationformv2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas3registrationformv2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignUp.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val fullname = binding.etFullname.text.toString()
            val username = binding.etUsername.text.toString()
            val password = binding.etPasssword.text.toString()


            if (email.isEmpty() || fullname.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                showLongToast("Email: $email")
                showLongToast("Fullname: $fullname")
                showLongToast("Username: $username")
                showLongToast("Password: $password")
            }
        }
    }

    private fun showLongToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}