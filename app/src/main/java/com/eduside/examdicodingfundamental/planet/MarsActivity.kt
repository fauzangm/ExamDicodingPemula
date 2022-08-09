package com.eduside.examdicodingfundamental.planet

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.eduside.examdicodingfundamental.R
import com.eduside.examdicodingfundamental.databinding.ActivityMarsBinding
import com.eduside.examdicodingfundamental.main.MainActivity

class MarsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMarsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_profile, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, MainActivity::class.java)
        when(item.itemId){
            R.id.tbHome -> startActivity(intent)

        }
        return true
    }
}