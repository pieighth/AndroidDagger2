package com.example.tools.features.joke

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tools.MainActivity
import com.example.tools.R
import com.example.tools.di.ViewModelFactory
import kotlinx.android.synthetic.main.jokes_fragment.*
import javax.inject.Inject

class JokesFragment : Fragment() {

    // Fields that need to be injected by the login graph


    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: JokesViewModel by viewModels { viewModelFactory }
    val jokeAdapter = JokeAdapter()
    override fun onAttach(context: Context) {
        super.onAttach(context)
        // Obtaining the login graph from LoginActivity and instantiate
        // the @Inject fields with objects from the graph
        (activity as MainActivity).jokesComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.jokes_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclew_id.layoutManager = LinearLayoutManager(this.activity)
        recyclew_id.adapter = jokeAdapter

        viewModel.jokes.observe(viewLifecycleOwner) {
            Log.d("JOKE", it.toString())
            jokeAdapter.addJokes(it)
        }
    }
}