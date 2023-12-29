package com.example.myhelloworldapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragmentlogin);

        val myButton = findViewById<Button>(R.id.btn_ClickMe_)
        val TextV_msg=findViewById<TextView>(R.id.textV_msg)
        myButton.setOnClickListener(View.OnClickListener {

            TextV_msg.setText("fuck you");
        })
    }
}