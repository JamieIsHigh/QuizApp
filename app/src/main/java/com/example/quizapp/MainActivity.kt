package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wynikCount = 0

        val grupa = findViewById<RadioGroup>(R.id.imageView23456)
        val dob1 = findViewById<RadioButton>(R.id.radioButton2)
        val dob2 = findViewById<RadioButton>(R.id.radioButton6)
        val dob3 = findViewById<RadioButton>(R.id.radioButton12)
        val dob4 = findViewById<RadioButton>(R.id.radioButton15)
        val dob5 = findViewById<RadioButton>(R.id.radioButton17)
        fun abecadlo(radioButton: RadioButton) {
            if (radioButton.isChecked == true) {
                wynikCount = wynikCount + 1
            }
            findViewById<TextView>(R.id.textView7).text = wynikCount.toString()
        }
        grupa.setOnCheckedChangeListener(group, checked -> )
        dob1.setOnClickListener {
            abecadlo(dob1)
        }
        dob2.setOnClickListener {
            abecadlo(dob2)
        }
        dob3.setOnClickListener {
            abecadlo(dob3)
        }
        dob4.setOnClickListener {
            abecadlo(dob4)
        }
        dob5.setOnClickListener {
            abecadlo(dob5)
        }
    }


}