package com.example.internshalaproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.internshalaproject.databinding.BannerMovieLayoutBinding
import com.example.internshalaproject.databinding.MoviesLayoutBinding


class MoviesAdapter(private val context : Context, private val bannerMoviesList : ArrayList<BannerMovies>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    class ViewHolder(binding: MoviesLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        val banner = binding.movieImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(MoviesLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return bannerMoviesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(bannerMoviesList[position].getImageUrl()).into(holder.banner)
    }

}

