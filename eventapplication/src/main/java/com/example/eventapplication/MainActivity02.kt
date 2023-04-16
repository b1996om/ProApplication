package com.example.eventapplication

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("bombom", "Touch down event")
            }
            MotionEvent.ACTION_UP ->{
                Log.d("bombom", "Touch up event")
            }
        }
        return super.onTouchEvent(event)
    }

}