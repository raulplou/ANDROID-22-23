package com.example.trabajofinal_glovo.utils;

import com.example.trabajofinal_glovo.entities.Index;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("apirestaurantes")
    Call<Index> getApi();
    //Call<ArrayList<Simpson>>  getPopularSimpson(@Path("count") int count);
/*
    @GET("movie/{movie_id}")
    Call<Movie> getMovieDetails(@Path("movie_id") int movieId,
                @Query("api_key") String apiKey, @Query("append_to_response") String credits);
*/

}
