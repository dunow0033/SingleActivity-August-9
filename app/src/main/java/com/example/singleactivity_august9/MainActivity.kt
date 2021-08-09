package com.example.singleactivity_august9

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Extend AppCompatActivity to let class know this is an activity
class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflating xml and attaching to the activity
        setContentView(R.layout.main_activity)
        Log.d(TAG, "onCreate")
        //assigning variable to the button in xml
        btn1 = findViewById(R.id.btn_1)
        btn1.setOnClickListener {
            btn1.text = getString(R.string.dont_click_me)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    companion object {
        private val TAG = MainActivity::class.java.name
    }
}