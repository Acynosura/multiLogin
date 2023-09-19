package com.example.multilogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multilogin.databinding.DashboardBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: DashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username2 = intent.getStringExtra(MainActivity.EXTRA_NAME)
        val email2 = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone2 = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding){
            hline12.text = username2
            hline22.text = email2
            hline32.text = phone2
        }
    }
}