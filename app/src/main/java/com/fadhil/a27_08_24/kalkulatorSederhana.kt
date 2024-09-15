package com.fadhil.a27_08_24

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class kalkulatorSederhana : AppCompatActivity() {

    private lateinit var etAngka1 : EditText
    private lateinit var etAngka2 : EditText
    private lateinit var btntambah : Button
    private lateinit var btnkurang : Button
    private lateinit var btnkali : Button
    private lateinit var txthasil : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulator_sederhana)

        etAngka1 = findViewById(R.id.etAngka1)
        etAngka2 = findViewById(R.id.etAngka2)
        btntambah = findViewById(R.id.btntambah)
        btnkurang = findViewById(R.id.btnkurang)
        btnkali = findViewById(R.id.btnkali)
        txthasil = findViewById(R.id.txthasil)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btntambah.setOnClickListener(){
            val angka1 = etAngka1.text.toString().toInt()
            val angka2 =etAngka2.text.toString().toInt()

            val hasil = angka1 + angka2
            txthasil.setText("Hasil tambah :" + hasil)
        }

        btnkurang.setOnClickListener(){
            val angka1 = etAngka1.text.toString().toInt()
            val angka2 =etAngka2.text.toString().toInt()

            val hasil = angka1 - angka2
            txthasil.setText("Hasil kurang :" + hasil)
        }

        btnkali.setOnClickListener(){
            val angka1 = etAngka1.text.toString().toInt()
            val angka2 =etAngka2.text.toString().toInt()

            val hasil = angka1 * angka2
            txthasil.setText("Hasil kali :" + hasil)
        }




    }
}