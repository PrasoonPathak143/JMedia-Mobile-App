package com.example.internshalaproject

data class BannerMovies(
    private var id : Int,
    private var movieName : String,
    private var imageUrl : String,
){
    fun getImageUrl() : String{
        return imageUrl
    }


}
