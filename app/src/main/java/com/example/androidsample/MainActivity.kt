package com.example.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convertCurrency(view: View) {
        if (dollarText.text.isNotEmpty()) {
                    val dollarValue = dollarText.text.toString().toFloat()
                    val euroValue = dollarValue * 0.85f
                    tv1.text = euroValue.toString()
                } else {
            tv1.text = getString(R.string.no_value_string)
        }
    }
}