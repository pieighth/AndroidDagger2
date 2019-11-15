package com.example.tools.features.joke

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tools.R
import com.example.tools.models.Joke
import kotlinx.android.synthetic.main.fragment_joke_detail.view.*

class JokeAdapter : RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    var jokes = mutableListOf<Joke>()

    fun addJokes(joke: MutableList<Joke>){
        this.jokes.addAll(joke)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        return JokeViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_joke_detail, parent, false))
    }

    override fun getItemCount(): Int {
        return this.jokes.size
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bindData(jokes[position], position)
    }

    class JokeViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        fun bindData(joke: Joke, position: Int){
            view.id_answer.text = joke.setup
            view.id_request.text = joke.punchline
        }
    }
}