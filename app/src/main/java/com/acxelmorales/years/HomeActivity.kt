package com.acxelmorales.years

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.acxelmorales.years.constants.Constants

class HomeActivity : AppCompatActivity() {

    var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        edad = intent.getIntExtra(Constants.YEARS_OLD, 0)

        val btn = findViewById<TextView>(R.id.activityHomeYear)
        btn.text = edad.toString()
    }

}
