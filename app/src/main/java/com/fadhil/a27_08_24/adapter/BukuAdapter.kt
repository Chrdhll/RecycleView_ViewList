package com.fadhil.a27_08_24.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.fadhil.a27_08_24.R
import com.fadhil.a27_08_24.model.ModelBuku

class BukuAdapter (private val buku: List<ModelBuku>) :
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>() {

    //view holder yang digunakan unutk menyimpan referensi layout item
    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtJudul : TextView = view.findViewById(R.id.txtjudulbuku)
        val txtPenulis : TextView = view.findViewById(R.id.txtpenulis)
    }

    //pengaturan data item pada setiap list dari recycle view
    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {
        holder.txtPenulis.text = buku[position].penulis
        holder.txtJudul.text = buku[position].title
    }

    //membuat layout list item sebagai item dari recycle view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {
        val  view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return  BukuAdapterHolder(view)
    }

    //mengembalikan panjang nilai dari data
    override fun getItemCount(): Int{
        return buku.size
    }

}