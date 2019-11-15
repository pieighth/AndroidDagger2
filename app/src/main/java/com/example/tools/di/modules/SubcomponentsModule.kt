package com.example.tools.di.modules

import com.example.tools.di.components.JokesComponent
import dagger.Module

@Module(subcomponents = [JokesComponent::class])
class SubcomponentsModule {}