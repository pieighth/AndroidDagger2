package com.example.tools.di.modules

import androidx.lifecycle.ViewModel
import com.example.tools.di.ViewModelKey
import com.example.tools.features.joke.JokesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(JokesViewModel::class)
    abstract fun bindDetailsViewModel(viewModel : JokesViewModel) : ViewModel
}