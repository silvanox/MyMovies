package com.example.mymovies.myinterface

import com.example.mymovies.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "45707e823ff8a65e7ddb634f9c70644f",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}