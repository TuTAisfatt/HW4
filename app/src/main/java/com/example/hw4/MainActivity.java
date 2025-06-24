package com.example.hw4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cardCountries, cardLeaders, cardMuseums, cardWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardCountries = findViewById(R.id.cardCountries);
        cardLeaders = findViewById(R.id.cardLeaders);
        cardMuseums = findViewById(R.id.cardMuseums);
        cardWonders = findViewById(R.id.cardWonders);

        cardCountries.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CountriesActivity.class);
            startActivity(intent);
        });

        cardLeaders.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LeadersActivity.class);
            startActivity(intent);
        });

        cardMuseums.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MuseumsActivity.class);
            startActivity(intent);
        });

        cardWonders.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WondersActivity.class);
            startActivity(intent);
        });
    }
}
