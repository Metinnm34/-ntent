package com.han.secondscreen


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.han.secondscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun next(view: View) {
     val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("name", binding.editTextText.text.toString())
        startActivity(intent)

    }


}