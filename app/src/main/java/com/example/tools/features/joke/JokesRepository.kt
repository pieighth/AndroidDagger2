package com.example.tools.features.joke

import com.example.tools.models.Joke
import com.example.tools.services.ApiService
import retrofit2.Call
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JokesRepository @Inject constructor(private val apiService: ApiService) {

    fun getData(): Call<MutableList<Joke>> {
        return apiService.get()

    }
}