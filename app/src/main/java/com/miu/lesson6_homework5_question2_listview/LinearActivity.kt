package com.miu.lesson6_homework5_question2_listview

import android.R.layout.simple_spinner_item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_linear.*

class LinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_linear)

        var intent= getIntent()
        var output = intent.getStringArrayExtra("AllItems")

        var adaptor= ArrayAdapter<String>(this, simple_spinner_item)
        listV.adapter=adaptor

        listV.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val item = parent.getItemAtPosition(position).toString()
                Toast.makeText(this," $item has been selected", Toast.LENGTH_LONG).show()

            }

    }
}