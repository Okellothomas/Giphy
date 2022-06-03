package com.example.giphy.connection;

import com.example.giphy.Constants;
import com.example.giphy.interfaces.GiphyAPi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GiphyClient {
    private static Retrofit retrofit = null;

    public static GiphyAPi getClient(){

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.GIPHY_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit.create(GiphyAPi.class);
    }
}
