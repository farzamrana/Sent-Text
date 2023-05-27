package com.example.applicationsecond

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var namesArray: Array<String> = arrayOf(
            "mohammd",
            "ali",
            "ghasem",
            "amir",
            "asghar",
            "zahra",
            "rogahye",
            "elham",
            "afsaneh",
            "borzo",
            "nilofar",
            "keyvan",
            "ghazanfar",
            "raziya",
            "mahmoud",
            "nikos",
            "maryam"
        )

        var nameAdapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, namesArray)

        var one = findViewById<ListView>(R.id.listone)

        one.adapter = nameAdapter

        one.setOnItemClickListener { parent, view, position, id ->
            var selectedName :String =one.getItemAtPosition(position).toString()
            val intent = Intent(this, Second::class.java)
            intent.putExtra("extra_text", selectedName)
            startActivity(intent)
            Toast.makeText(this, "hello ${selectedName} ", Toast.LENGTH_SHORT).show()

        }}}








