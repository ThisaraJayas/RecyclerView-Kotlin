package com.example.recyclerview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//create
class MyAdapter(private val newsList:ArrayList<AminoAcidModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val titleImage:ImageView=itemView.findViewById(R.id.imageView)
        val textOne:TextView=itemView.findViewById(R.id.textView)
        val textTwo:TextView=itemView.findViewById(R.id.textView2)
        val textTree:TextView=itemView.findViewById(R.id.textView3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=newsList[position]
        holder.titleImage.setImageResource(currentItem.image)
        holder.textOne.text=currentItem.acidName
        holder.textTwo.text=currentItem.acidAbriviation
        holder.textTree.text=currentItem.acidAbrivitationSmall
    }
}