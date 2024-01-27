package com.example.instarecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class FeedPageAdapter(private var feedPostList: List<FeedPost>)   : RecyclerView.Adapter<FeedPageAdapter.PostViewHolder>() {

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dpImg: ImageView = itemView.findViewById(R.id.dpImg)
        val userId: TextView = itemView.findViewById(R.id.userId)
        val feedImg: ImageView = itemView.findViewById(R.id.feedImg)
        val likeImg1: ImageView = itemView.findViewById(R.id.likeImg1)
        val likeImg2: ImageView = itemView.findViewById(R.id.likeImg2)
        val likedById: TextView = itemView.findViewById(R.id.likedById)
        val totalLikes: TextView = itemView.findViewById(R.id.totalLikes)
        val caption: TextView = itemView.findViewById(R.id.caption)
        val totalComment: TextView = itemView.findViewById(R.id.totalComment)
        val oneComment: TextView = itemView.findViewById(R.id.oneComment)
        val oneCommentId: TextView = itemView.findViewById(R.id.oneCommentId)
        val postDate: TextView = itemView.findViewById(R.id.postDate)

    }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
         val itemView = LayoutInflater.from(parent.context)
             .inflate(R.layout.feedlayout, parent, false)

         return PostViewHolder(itemView)
     }

     override fun getItemCount(): Int {
         return feedPostList.size     }

     override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

         val currentPost = feedPostList[position]

         holder.userId.text = currentPost.userId
         holder.likedById.text = currentPost.likedById
         holder.totalLikes.text = currentPost.totalLikes.toString()
         holder.caption.text = currentPost.caption
         holder.totalComment.text = currentPost.totalComment
         holder.oneComment.text = currentPost.oneComment
         holder.oneCommentId.text = currentPost.oneCommentId
         holder.postDate.text = currentPost.postDate


         Glide
             .with(holder.itemView.context)
             .load(currentPost.dpImg)
             .centerCrop()
             .into(holder.dpImg)

         Glide
             .with(holder.itemView.context)
             .load(currentPost.feedImg)
             .centerCrop()
             .into(holder.feedImg)

         Glide
             .with(holder.itemView.context)
             .load(currentPost.likeImg1)
             .centerCrop()
             .into(holder.likeImg1)

         Glide
             .with(holder.itemView.context)
             .load(currentPost.likeImg2)
             .centerCrop()
             .into(holder.likeImg2)

 }

}
