package com.example.usupbekov_adilet_homework_3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_fragment_one,UpperFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_fragment_two,LowerFragment()).commit()
    }
}