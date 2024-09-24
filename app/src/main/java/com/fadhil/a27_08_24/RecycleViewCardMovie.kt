package com.fadhil.a27_08_24

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fadhil.a27_08_24.adapter.MovieAdapter
import com.fadhil.a27_08_24.model.ModelMovie
import java.util.ArrayList

class RecycleViewCardMovie : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var movieAdapter: MovieAdapter? = null
    private var movieList = mutableListOf<ModelMovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view_card_movie)

        movieList = ArrayList()
        recyclerView = findViewById(R.id.rvMovieList) as RecyclerView
        movieAdapter = MovieAdapter(this, movieList) { position ->
            showDetailDialog(position as Int)
        }
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter

        prepareMovielist()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    private fun prepareMovielist() {
        var movie = ModelMovie(
            "Avatar",
            R.drawable.avatar,
            "Tanggal rilis : 10 Desember 2009",
            getString(R.string.sinopsisavatar)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Batman",
            R.drawable.batman,
            "Tanggal rilis : 4 Maret 2022",
            getString(R.string.sinopsisbatman)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "End Game",
            R.drawable.end_game,
            "Tanggal rilis : 26 April 2019",
            getString(R.string.sinopsisendgame)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Hulk",
            R.drawable.hulk,
            "Tanggal rilis : 13 Juni 2008",
            getString(R.string.sinopsishulk)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Inception",
            R.drawable.inception,
            "Tanggal rilis : 16 Juli 2010",
            getString(R.string.sinopsisinception)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Jumanji",
            R.drawable.jumanji,
            "Tanggal rilis : 20 Desember 2017",
            getString(R.string.sinopsisjumanji)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Lucy",
            R.drawable.lucy,
            "Tanggal rilis : 25 Juli 2015",
            getString(R.string.sinopsislucy)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Jurassic World",
            R.drawable.jurassic_world,
            "Tanggal rilis : 29 Mei 2015",
            getString(R.string.sinopsisjurasic)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Spider Man",
            R.drawable.spider_man,
            "Tanggal rilis : 3 Mei 2002",
            getString(R.string.sinopsisspiderman)
        )
        movieList.add(movie)
        movie = ModelMovie(
            "Venom",
            R.drawable.venom,
            "Tanggal rilis : 5 oktober 2018",
            getString(R.string.sinopsisvenom)
        )
        movieList.add(movie)

        movieAdapter!!.notifyDataSetChanged()
    }


    private fun showDetailDialog(position: Int) {
        val intent = Intent(this, DetailMovieActivity::class.java)
        intent.putExtra("imageResId", movieList[position].image)
        intent.putExtra("title", movieList[position].title)
        intent.putExtra("tanggal", movieList[position].tanggal)
        intent.putExtra("sinopsis", movieList[position].sinopsis)
        startActivity(intent)
    }

}