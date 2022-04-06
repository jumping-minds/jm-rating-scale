package com.jumpingminds.ratingscaleex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jumpingminds.jmratingscale.JMRatingScale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingScale = findViewById<JMRatingScale>(R.id.ratingscale)

        ratingScale.setOnRatingListener { rating ->
            Log.d("rating", rating.toString())
        }
    }
}
