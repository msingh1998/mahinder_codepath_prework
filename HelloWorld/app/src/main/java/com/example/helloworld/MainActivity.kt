package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  //display customized text

        findViewById<Button>(R.id.button).setOnClickListener{
            //handle button tap
            Log.i( "Mahinder", "tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_200))

        }
    }
}