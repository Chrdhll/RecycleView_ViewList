package com.fadhil.a27_08_24.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fadhil.a27_08_24.R
import com.fadhil.a27_08_24.RecycleViewCardMovie
import com.fadhil.a27_08_24.model.ModelMovie

class MovieAdapter(
    private val getActivity: RecycleViewCardMovie,
    private val movieList: List<ModelMovie>,
    private val onItemClick: (Int) -> Unit
) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari item layout
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        //ini ketika item di klik
        holder.cardView.setOnClickListener() {
            onItemClick(position)
            Toast.makeText(
                getActivity, movieList[position].title,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}
