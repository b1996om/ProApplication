package com.example.eventapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.eventapplication.databinding.ActivityMain05Binding

class MainActivity05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain05Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkbox1.setOnCheckedChangeListener {
            compoundButton, b ->
                Log.d("bombom", "체크박스클릭")
            }
        }
}

