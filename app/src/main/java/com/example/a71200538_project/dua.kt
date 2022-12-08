package com.example.a71200538_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class dua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)
        val gr1 = findViewById<RadioGroup>(R.id.rgJk)


        val gr2 = findViewById<RadioGroup>(R.id.rgKL)
        val date = intent.getStringExtra("tanggal")
        val asal = intent.getStringExtra("kotaAsal")
        val tujuan = intent.getStringExtra("kotaTujuan")


        val button1 = findViewById<Button>(R.id.btnSGoTo)

        button1.setOnClickListener(){
            val i = Intent(this, satu::class.java);
            val intSelectButton1: Int = gr1.checkedRadioButtonId
            val jam = findViewById<RadioButton>(intSelectButton1)
            val intSelectButton2: Int = gr2.checkedRadioButtonId
            val jenis = findViewById<RadioButton>(intSelectButton2)
            i.putExtra("tanggal", date)
            i.putExtra("kotaAsal", asal)
            i.putExtra("kotaTujuan", tujuan)
            i.putExtra("jam", jam.text)
            i.putExtra("jenis", jenis.text)
            startActivity(i)
        }
    }
}