package com.fadhil.a27_08_24

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageHome : AppCompatActivity() {

    private lateinit var btnpassing : Button
    private lateinit var btnhewan : Button
    private lateinit var btnrvbuku : Button
    private lateinit var btnkalkulator : Button
    private lateinit var btnrvbuah : Button
    private lateinit var btnrvmovie : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_home)

        btnpassing = findViewById(R.id.btnPassing)
        btnhewan = findViewById(R.id.btnhewan)
        btnrvbuku = findViewById(R.id.btnrvbuku)
        btnkalkulator = findViewById(R.id.btnkalkulator)
        btnrvbuah= findViewById(R.id.btnrvbuah)
        btnrvmovie= findViewById(R.id.btnrvmoviecard)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnpassing.setOnClickListener(){
            val intent = Intent(this,LoginScreen::class.java)
            startActivity(intent)
        }

        btnhewan.setOnClickListener(){
            val intent = Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }

        btnrvbuku.setOnClickListener(){
            val intent = Intent(this,RecycleViewActivity::class.java)
            startActivity(intent)
        }

        btnkalkulator.setOnClickListener(){
            val intent = Intent(this,kalkulatorSederhana::class.java)
            startActivity(intent)
        }

        btnrvbuah.setOnClickListener(){
            val intent = Intent(this,CustomeImageRecycleView::class.java)
            startActivity(intent)
        }

        btnrvmovie.setOnClickListener(){
            val intent = Intent(this,RecycleViewCardMovie::class.java)
            startActivity(intent)
        }


    }
}