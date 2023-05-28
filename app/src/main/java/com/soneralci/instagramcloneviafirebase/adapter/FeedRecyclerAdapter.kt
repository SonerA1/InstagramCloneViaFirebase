package com.soneralci.instagramcloneviafirebase.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soneralci.instagramcloneviafirebase.databinding.RecyclerRowBinding
import com.soneralci.instagramcloneviafirebase.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(private val postList : ArrayList<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {

    class PostHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
       val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recylerEmailText.text = postList.get(position).email
        holder.binding.recylerCommentText.text = postList.get(position).comment
        // images pull
        Picasso.get().load(postList.get(position).downloadUrl).into(holder.binding.recylerImageView)

    }

}