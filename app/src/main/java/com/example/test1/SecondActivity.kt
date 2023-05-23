package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("MainActivity", "onCreate: Activity B ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: Activity B ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: Activity B ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: Activity B ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop: Activity B ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: Activity B ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart: Activity B ")
    }

    fun onActivityMainClick(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}