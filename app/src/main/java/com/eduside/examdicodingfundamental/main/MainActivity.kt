package com.eduside.examdicodingfundamental.main

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eduside.examdicodingfundamental.R
import com.eduside.examdicodingfundamental.adapter.PlanetViewAdapter
import com.eduside.examdicodingfundamental.databinding.ActivityMainBinding
import com.eduside.examdicodingfundamental.planet.*
import com.eduside.examdicodingfundamental.profile.ProfileActivity
import com.eduside.examdicodingfundamental.repository.dataplanet
import com.eduside.examdicodingfundamental.repository.planet



class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var list : ArrayList<dataplanet> = arrayListOf()
    private lateinit var rvplanet : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val actionBar: android.app.ActionBar? = actionBar
//        actionBar!!.setBackgroundDrawable(resources.getDrawable(R.drawable.action_bar))
//        supportActionBar?.setDisplayShowTitleEnabled(false)

        rvplanet = binding.rvPlanet
        rvplanet.setHasFixedSize(true)

        list.addAll(planet.listdata)
        showRecylerView()
    }

    private fun showRecylerView() {
        rvplanet.layoutManager = LinearLayoutManager(this)
        val adapter = PlanetViewAdapter(list, object : PlanetViewAdapter.OnAdapterListener{
            override fun onClick(result: dataplanet) {
                val name = result.nama
                if (name == "Matahari"){
                    startActivity(Intent(this@MainActivity,MatahariActivity::class.java))
                }else if(name == "Merkurius"){
                    startActivity(Intent(this@MainActivity,MerkuriusActivity::class.java))
                }else if(name == "Venus"){
                    startActivity(Intent(this@MainActivity,VenusActivity::class.java))
                }else if (name =="Bumi"){
                    startActivity(Intent(this@MainActivity,BumiActivity::class.java))
                }else if (name =="Mars"){
                    startActivity(Intent(this@MainActivity,MarsActivity::class.java))
                }else if (name =="Jupiter"){
                    startActivity(Intent(this@MainActivity,JupiterActivity::class.java))
                }else if (name =="Saturnus"){
                    startActivity(Intent(this@MainActivity,SaturnusActivity::class.java))
                }else if (name =="Uranus"){
                    startActivity(Intent(this@MainActivity,UranusActivity::class.java))
                }else if (name =="Neptunus"){
                    startActivity(Intent(this@MainActivity,NeotunusActivity::class.java))
                }else if (name =="Pluto"){
                    startActivity(Intent(this@MainActivity,PlutoActivity::class.java))
                }
            }
        })
        rvplanet.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this,ProfileActivity::class.java)
        when(item.itemId){
            R.id.tbProfile -> startActivity(intent)

        }
        return true
    }
}