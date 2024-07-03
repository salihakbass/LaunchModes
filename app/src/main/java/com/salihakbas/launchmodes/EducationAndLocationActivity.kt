package com.salihakbas.launchmodes

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salihakbas.launchmodes.databinding.ActivityEducationAndLocationBinding

class EducationAndLocationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityEducationAndLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEducationAndLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApplySignUp.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}