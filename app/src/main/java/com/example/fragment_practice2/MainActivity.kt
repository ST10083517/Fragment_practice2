package com.example.fragment_practice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = First_Fragment()
        val secondFragment = fragment_second()
        val btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        val btnFragment2 = findViewById<Button>(R.id.btnFragment2)


        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {

                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()
            }
            btnFragment2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {

                    replace(R.id.flFragment, secondFragment)
                    addToBackStack(null)
                    commit()
                }

            }


        }
    }
}