package com.example.giphy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.giphy.adapters.GifRecyclerAdapter;
import com.example.giphy.models.Response;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchResults extends AppCompatActivity {
    Response response;
    @BindView(R.id.search_results)
    RecyclerView searchResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        ButterKnife.bind(this);

        response = (Response) getIntent().getSerializableExtra("Response");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        searchResults.setLayoutManager(gridLayoutManager);
        searchResults.setAdapter(new GifRecyclerAdapter(this,response.getData()));

    }
}