package com.example.a71200538_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class satu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val asal = intent.getStringExtra("kotaAsal")
        val tujuan = intent.getStringExtra("kotaTujuan")
        val tanggal = intent.getStringExtra("tanggal")
        val jam = intent.getStringExtra("jam")
        val jenis = intent.getStringExtra("jenis")
        Toast.makeText(this, "$asal $tujuan $tanggal $jam $jenis", Toast.LENGTH_SHORT).show()

    }
}