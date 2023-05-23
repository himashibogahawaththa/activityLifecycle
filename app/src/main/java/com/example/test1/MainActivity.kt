package com.example.test1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate: Activity A")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: Activity A ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: Activity A ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: Activity A ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop: Activity A ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: Activity A ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart: Activity A ")
    }

    fun onActivitySecondClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}