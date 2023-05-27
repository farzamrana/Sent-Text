package com.example.applicationsecond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var two = findViewById<TextView>(R.id.textView)
        var btt = findViewById<Button>(R.id.button);
        val Name = intent.getStringExtra("extra_text");
        two.text = "WELLCOME \n" + "      "+Name;

        btt.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
    }

    }
}