package com.neerajdevil.lpsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(R.layout.test_name)
{
    lateinit var button : Button
    lateinit var myText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        button  = findViewById<Button>(R.id.btn1)
        myText  = findViewById<TextView>(R.id.text)

        button.text = "Click Me!"

        button.setOnClickListener {
            myText.text = "Button Clicked!!!"
        }
    }
}