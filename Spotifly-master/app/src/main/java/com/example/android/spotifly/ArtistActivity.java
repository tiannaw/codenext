package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<CategoryItem> artists = new ArrayList<>();
        artists.add(new CategoryItem("Kid Cudi", R.drawable.cudi));
        artists.add(new CategoryItem("Drake", R.drawable.drake));
        artists.add(new CategoryItem("Summer Walker", R.drawable.summer2));
        artists.add(new CategoryItem("Jhené Aiko", R.drawable.aiko));
        artists.add(new CategoryItem("Brent Faiyaz", R.drawable.brent));
        artists.add(new CategoryItem("Bryson Tiller", R.drawable.bryson));
        artists.add(new CategoryItem("Kehlani", R.drawable.kehlani));

        ListView listView = findViewById(R.id.artist_listview);
        CategoryAdapter artistAdapter = new CategoryAdapter(this, artists);
        listView.setAdapter(artistAdapter);



    }
}
