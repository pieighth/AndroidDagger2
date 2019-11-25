package com.example.tools.features.movies.create


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.navGraphViewModels
import com.example.tools.MyApplication

import com.example.tools.R
import com.example.tools.di.ViewModelFactory
import com.example.tools.features.movies.MovieViewModel
import javax.inject.Inject


class CreateFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: MovieViewModel by navGraphViewModels(R.id.movies_graph) { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context.applicationContext as MyApplication).appComponent
            .movieComponent()
            .create()
            .inject(this)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_create, container, false)
    }
}
