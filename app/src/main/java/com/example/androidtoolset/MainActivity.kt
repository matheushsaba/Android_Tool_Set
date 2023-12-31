package com.example.androidtoolset

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidtoolset.ui.theme.AndroidToolsetTheme
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSumNumbers = findViewById<ImageButton>(R.id.btnSumNumbers)
        btnSumNumbers.setOnClickListener {
            val intent = Intent(this, SumActivity::class.java)
            startActivity(intent)
        }

        val btnSendMessage = findViewById<ImageButton>(R.id.btnSendMessage)
        btnSendMessage.setOnClickListener {
            val intent = Intent(this, SendMessageActivity::class.java)
            startActivity(intent)
        }

        val btnCheckAcceleration = findViewById<ImageButton>(R.id.btnCheckAcceleration)
        btnCheckAcceleration.setOnClickListener {
            val intent = Intent(this, AccelerometerValuesActivity::class.java)
            startActivity(intent)
        }

        val btnCheckLuminosity = findViewById<ImageButton>(R.id.btnCheckLuminosity)
        btnCheckLuminosity.setOnClickListener {
            val intent = Intent(this, LuminosityValueActivity::class.java)
            startActivity(intent)
        }

        val btnTouchCoordinates = findViewById<ImageButton>(R.id.btnCheckTemperature)
        btnTouchCoordinates.setOnClickListener {
            val intent = Intent(this, TouchValueActivity::class.java)
            startActivity(intent)
        }

        val btnCheckGeoposition = findViewById<ImageButton>(R.id.btnCheckGeoPosition)
        btnCheckGeoposition.setOnClickListener {
            val intent = Intent(this, GeopositionActivity::class.java)
            startActivity(intent)
        }

//        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show()
    }

//    override fun onStart() {
//        super.onStart()
//
//        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//
//        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//
//        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStop() {
//        super.onStop()
//
//        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
//    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
    }



}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello aloha $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidToolsetTheme {
        Greeting("Android")
    }
}