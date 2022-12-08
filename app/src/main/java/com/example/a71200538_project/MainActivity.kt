package com.example.a71200538_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_satu)
    val gr1 = findViewById<RadioGroup>(R.id.rgAs)
    val kaYog = findViewById<RadioButton>(R.id.rbYA)
    val kaJak = findViewById<RadioButton>(R.id.rbJA)
    val kaBal = findViewById<RadioButton>(R.id.rbBA)

    val gr2 = findViewById<RadioGroup>(R.id.rgAt)
    val ktYog = findViewById<RadioButton>(R.id.rbYT)
    val ktJak = findViewById<RadioButton>(R.id.rbJT)
    val ktBal = findViewById<RadioButton>(R.id.rbBT)

    val date = findViewById<EditText>(R.id.edtDate)

    val button1 = findViewById<Button>(R.id.btnSGo)

    button1.setOnClickListener(){
            val i = Intent(this, dua::class.java);
            val intSelectButton1: Int = gr1.checkedRadioButtonId
            val asal = findViewById<RadioButton>(intSelectButton1)
            val intSelectButton2: Int = gr2.checkedRadioButtonId
            val tujuan = findViewById<RadioButton>(intSelectButton2)
            i.putExtra("tanggal", date.text)
            i.putExtra("kotaAsal", asal.text)
            i.putExtra("kotaTujuan", tujuan.text)
            startActivity(i)
    }






}
}