package com.example.tools.services

import com.example.tools.models.Joke
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/random_ten")
    fun get(): Call<MutableList<Joke>>
}