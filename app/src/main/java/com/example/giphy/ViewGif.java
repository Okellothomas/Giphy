package com.example.giphy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.giphy.connection.GiphyClient;
import com.example.giphy.interfaces.GiphyAPi;
import com.example.giphy.models.Datum;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ViewGif extends AppCompatActivity {
    GiphyAPi giphyAPi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_gif);
        Datum datum = (Datum) getIntent().getSerializableExtra("Gif");
        giphyAPi = GiphyClient.getClient();

        Call<Datum> call = giphyAPi.getByID(datum.getId(),Constants.API_KEY);
        call.enqueue(new Callback<Datum>() {
            @Override
            public void onResponse(Call<Datum> call, Response<Datum> response) {

            }

            @Override
            public void onFailure(Call<Datum> call, Throwable t) {

            }
        });
    }
}