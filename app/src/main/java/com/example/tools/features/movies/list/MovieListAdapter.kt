package com.example.tools.features.movies.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tools.R
import com.example.tools.models.Movie

class MovieListAdapter : RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>(){
    var movies = mutableListOf<Movie>()

    fun addAllMovies(movies: MutableList<Movie>){
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_itens_list, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.movieBindData(movies[position], position)
    }
    class MovieViewHolder(val view: View) :  RecyclerView.ViewHolder(view) {
        fun movieBindData(movie: Movie, position :Int){

        }
    }
}