package com.example.testandroid

import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var initTime = 0L
    var pauseTime = 0L

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        if(keyCode === KeyEvent.KEYCODE_BACK) {
            
            if(System.currentTimeMillis() - initTime > 3000) {
                Toast.makeText(this, "원하시는 위치를 누르세요!", Toast.LENGTH_SHORT).show()
                initTime = System.currentTimeMillis()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}