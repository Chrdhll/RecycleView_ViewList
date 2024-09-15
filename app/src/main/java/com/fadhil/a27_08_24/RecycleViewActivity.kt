package com.fadhil.a27_08_24

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fadhil.a27_08_24.adapter.BukuAdapter
import com.fadhil.a27_08_24.model.ModelBuku

class RecycleViewActivity : AppCompatActivity() {

    //view grup --> bisa menampung data lebih banyak dan lebih cepat
    //recycle load data yang dilayar aja

    private lateinit var rv_buku : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        rv_buku =findViewById(R.id.rv_buku)
        //bikin array data
        val listBuku = listOf(
            ModelBuku(title = "Buku Android Kotlin 2024", penulis ="Fadhil"),
            ModelBuku(title = "Rembulan Tenggelam di Wajahmu", penulis ="Tere Liye"),
            ModelBuku(title = "Segala galanya ambyar", penulis ="Mark Manson"),
            ModelBuku(title = "Sapiens", penulis ="Yuval Noah Harari"),
            ModelBuku(title = "Selamat Tinggal", penulis ="Tere Liye")
        )
        val nBukuAdapter  = BukuAdapter(listBuku)

        rv_buku.apply{
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}