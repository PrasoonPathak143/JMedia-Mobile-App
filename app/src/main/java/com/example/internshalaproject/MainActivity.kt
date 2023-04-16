package com.example.internshalaproject

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.internshalaproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding ?= null
    private var dropdownLinksList: ArrayList<String> ?= null
    private var bannerMoviesList : ArrayList<BannerMovies> ?= null
    private var rcAdapter : BannerMoviePagerAdapter? = null
    private var moviesList : ArrayList<BannerMovies> ?= null
    private var rcMoviesNext1 : MoviesAdapter? = null
    private var rcMoviesNext2 : MoviesAdapter? = null
    private var rcMoviesNext3 : MoviesAdapter? = null
    private var rcMoviesNext4 : MoviesAdapter? = null
    private var rcMoviesNext5 : MoviesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        dropDownSetUp()
        setBannerMoviesPagerAdapter()
        setMovies1()
        setMovies2()
        setMovies3()
        setMovies4()
        setMovies5()
    }
    private fun dropDownSetUp(){
        dropdownLinksList = Constants.getDropDownList()
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,dropdownLinksList!!)
        binding?.dropdownSpinner?.adapter = adapter
    }

    private fun setBannerMoviesPagerAdapter(){
        bannerMoviesList = Constants.getBannerMovies()
        binding?.rcBanner?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcAdapter = BannerMoviePagerAdapter(this,bannerMoviesList!!)
        binding?.rcBanner?.adapter = rcAdapter
    }
    private fun setMovies1(){
        moviesList = Constants.getMovies()
        binding?.rcMovies1?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcMoviesNext1 = MoviesAdapter(this,moviesList!!)
        binding?.rcMovies1?.adapter = rcMoviesNext1
    }
    private fun setMovies2(){
        moviesList = Constants.getNewMovies()
        binding?.rcMovies2?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcMoviesNext2 = MoviesAdapter(this,moviesList!!)
        binding?.rcMovies2?.adapter = rcMoviesNext2
    }
    private fun setMovies3(){
        moviesList = Constants.getActionMovies()
        binding?.rcMovies3?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcMoviesNext3 = MoviesAdapter(this,moviesList!!)
        binding?.rcMovies3?.adapter = rcMoviesNext3
    }
    private fun setMovies4(){
        moviesList = Constants.getKidsMovies()
        binding?.rcMovies4?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcMoviesNext4 = MoviesAdapter(this,moviesList!!)
        binding?.rcMovies4?.adapter = rcMoviesNext4
    }
    private fun setMovies5(){
        moviesList = Constants.getHorrorMovies()
        binding?.rcMovies5?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcMoviesNext5 = MoviesAdapter(this,moviesList!!)
        binding?.rcMovies5?.adapter = rcMoviesNext5
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}