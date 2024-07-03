package com.salihakbas.launchmodes

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salihakbas.launchmodes.databinding.ActivityUserInfoBinding

class UserInfoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityUserInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToEducationLocation.setOnClickListener {
            val intent = Intent(this, EducationAndLocationActivity::class.java)
            startActivity(intent)
        }
    }
}