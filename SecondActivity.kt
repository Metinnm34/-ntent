package com.han.secondscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.han.secondscreen.databinding.ActivityMainBinding
import com.han.secondscreen.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intentFromMain = intent  //getIntent()
        val name = intentFromMain.getStringExtra("name")
        binding.textView3.text = "Name : ${name}"


        println("OnCreate executed")

    }


    override fun onResume() {
        super.onResume()
        println("OnResume executed")

    }

    override fun onStart() {
        super.onStart()
        println("OnStart executed")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("OnDestroy executed")

    }

    override fun onPause() {
        super.onPause()
        println("OnPause executed")

    }

    override fun onStop() {
        super.onStop()
        println("OnStop executed")

    }





}
