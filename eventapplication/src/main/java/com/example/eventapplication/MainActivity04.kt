package com.example.eventapplication

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main04)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
       Log.d("bombom", "onkeyDown")
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("bombom", "onkeyUp")
        return super.onKeyUp(keyCode, event)
    }
}

