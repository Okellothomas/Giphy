package com.example.giphy.interfaces;

import com.example.giphy.models.Datum;
import com.example.giphy.models.Response;

import java.sql.DatabaseMetaData;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GiphyAPi {
    @GET("search")
    Call<Response> searchGif(@Query("api_key") String apiKey,
                             @Query("q") String term,
                             @Query("limit") int limit);
    @GET("{id}")
    Call<Datum> getByID(@Path("id") String path,@Query("api_key") String apiKey);
}
