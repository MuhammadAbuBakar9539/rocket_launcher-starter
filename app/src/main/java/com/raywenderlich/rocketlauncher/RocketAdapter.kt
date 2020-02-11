package com.raywenderlich.rocketlauncher

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RocketAdapter(private val context: Context, private val items: List<RocketAnimationItem>) :
    RecyclerView.Adapter<RocketAdapter.RocketViewHolder>() {

  override fun getItemCount(): Int = items.size

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RocketViewHolder {
    val view = LayoutInflater.from(parent.context)
        .inflate(android.R.layout.simple_list_item_1, parent, false)

    return RocketViewHolder(view)
  }

  override fun onBindViewHolder(holder: RocketViewHolder, position: Int) {
    holder.title.text = items[position].title
    holder.setTitleOnClickListener(context, items)
  }

  class RocketViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(android.R.id.text1)

    fun setTitleOnClickListener(context: Context, items: List<RocketAnimationItem>) {
      title.setOnClickListener { context.startActivity(items[adapterPosition].intent) }
    }
  }
}
