package com.example.internshalaproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.internshalaproject.databinding.BannerMovieLayoutBinding


class BannerMoviePagerAdapter(private val context : Context, private val bannerMoviesList : ArrayList<BannerMovies>) : RecyclerView.Adapter<BannerMoviePagerAdapter.ViewHolder>() {

    class ViewHolder(binding: BannerMovieLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        val banner = binding.bannerImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(BannerMovieLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return bannerMoviesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(bannerMoviesList[position].getImageUrl()).into(holder.banner)
    }

}

