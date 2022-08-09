package com.eduside.examdicodingfundamental.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.eduside.examdicodingfundamental.databinding.ActivitySplashBinding
import com.eduside.examdicodingfundamental.main.MainActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        delayandGoToMain()
    }

    private fun delayandGoToMain() {
        Handler(Looper.getMainLooper()).postDelayed({
        startActivity(Intent(this,MainActivity::class.java))
        },1200)
    }
}