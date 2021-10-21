package com.acxelmorales.years

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText

import com.acxelmorales.years.constants.Constants

class MainActivity : AppCompatActivity() {
    var year: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.mainActivityBtnSend)
        val inputText = findViewById<EditText>(R.id.inputYear)

        btn.setOnClickListener {
            year = inputText.text.toString().toInt()

            if (year >= 18) {
                var intent = Intent(this, HomeActivity::class.java)
                intent.putExtra(Constants.YEARS_OLD, year)
                startActivity(intent)
            } else {
                var intent = Intent(this, NoAccess::class.java)
                startActivity(intent)
            }
        }
    }
}
