package com.example.sumtwonumbers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class ShowReceivedMessageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_received_message)

        val receivedMessageTextView = findViewById<TextView>(R.id.receivedMessageTextView)
        val message = intent.getStringExtra("EXTRA_MESSAGE")
        receivedMessageTextView.text = message
    }
}