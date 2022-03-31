package com.hyunjine.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hyunjine.kotlinpractice.practice.ExtensionFunction

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "winter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val result = ExtensionFunction().getResult(list)
        Log.d(TAG, "onCreate: $result")
    }
}