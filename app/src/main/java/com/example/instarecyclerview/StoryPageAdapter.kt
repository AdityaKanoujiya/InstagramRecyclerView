package com.example.instarecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class StoryPageAdapter(private var storyPostList: List<StoryPost>) : RecyclerView.Adapter<StoryPageAdapter.PostViewHolder>() {

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textViewId: TextView = itemView.findViewById(R.id.textViewId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.storylayout, parent, false)

        return PostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentPost = storyPostList[position]
        holder.textViewId.text = currentPost.ids

        Glide
            .with(holder.itemView.context)
            .load(currentPost.img)
            .centerCrop()

            .into(holder.imageView)
    }


    override fun getItemCount(): Int {
        return storyPostList.size
    }

    fun setData(newPostList: List<StoryPost>) {
        storyPostList = newPostList
        notifyDataSetChanged()
    }
}
