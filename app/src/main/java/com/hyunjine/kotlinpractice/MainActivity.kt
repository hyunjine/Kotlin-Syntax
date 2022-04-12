package com.hyunjine.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyunjine.kotlinpractice.practice.ScopeFunction

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "winter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ScopeFunction.start()
    }
}
