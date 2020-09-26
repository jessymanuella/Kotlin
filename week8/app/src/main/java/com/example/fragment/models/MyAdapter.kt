package com.example.fragment.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.R

class MyAdapter(private val myDataset: List<Users>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    class MyViewHolder( itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView =itemView.findViewById(R.id.image_view)
        val name: TextView = itemView.findViewById(R.id.name_user)
        val title: TextView = itemView.findViewById(R.id.title_user)
        val age: TextView = itemView.findViewById(R.id.age_user)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_user_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //   holder.textView.text = myDataset[position]
        val currentItem = myDataset[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.name.text = currentItem.name
        holder.age.text = currentItem.age.toString() + " year-old"
        holder.title.text = currentItem.title
    }

    override fun getItemCount()= myDataset.size
}