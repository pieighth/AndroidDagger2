package com.example.tools.di.modules

import androidx.lifecycle.ViewModel
import com.example.tools.di.ViewModelKey
import com.example.tools.features.joke.JokesViewModel
import com.example.tools.features.movies.MoviesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(JokesViewModel::class)
    abstract fun bindDetailsViewModel(viewModel : JokesViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MoviesViewModel::class)
    abstract fun bindMovieViewModel(viewModel : MoviesViewModel) : ViewModel

}