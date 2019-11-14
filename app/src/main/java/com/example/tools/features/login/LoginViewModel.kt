package com.example.tools.features.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tools.models.Joke
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository): ViewModel() {

    var jokes = MutableLiveData<MutableList<Joke>>()
    init {
        loginRepository.getData().enqueue(object : Callback<MutableList<Joke>> {
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