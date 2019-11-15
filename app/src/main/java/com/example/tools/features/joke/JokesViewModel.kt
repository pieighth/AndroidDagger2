package com.example.tools.features.joke

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tools.models.Joke
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class JokesViewModel @Inject constructor(private val jokesRepository: JokesRepository): ViewModel() {

    var jokes = MutableLiveData<MutableList<Joke>>()
    init {
        jokesRepository.getData().enqueue(object : Callback<MutableList<Joke>> {
            override fun onFailure(call: Call<MutableList<Joke>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<MutableList<Joke>>,
                response: Response<MutableList<Joke>>
            ) {


                response.body().let {
                    jokes.postValue(it)
                }
            }

        })
    }

}