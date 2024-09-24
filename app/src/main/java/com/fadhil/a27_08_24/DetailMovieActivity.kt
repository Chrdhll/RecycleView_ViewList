package com.fadhil.a27_08_24

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovieActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        val imageResId = intent.getIntExtra("imageResId",-1)
        val judul = intent.getStringExtra("title")
        val tanggal = intent.getStringExtra("tanggal")
        val sinopsis = intent.getStringExtra("sinopsis")


        if(imageResId != -1){
            val imageView = findViewById<ImageView>(R.id.imageViewDetail)
            val TextView = findViewById<TextView>(R.id.judulmovie)
            val txttanggal = findViewById<TextView>(R.id.txttgl)
            val txtsinopsis = findViewById<TextView>(R.id.txtsinopsis)


            txtsinopsis.text = sinopsis
            txttanggal.text = tanggal
            TextView.text = judul
            imageView.setImageResource(imageResId)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}