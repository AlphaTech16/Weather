package com.avash.weather.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.avash.weather.R;
import com.avash.weather.api.WeatherApi;
import com.avash.weather.model.Weather;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StartActivity extends AppCompatActivity {

    WeatherApi weatherApi;

    TextView viewTextView;
    ImageView imageImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        viewTextView = (TextView) findViewById(R.id.viewTextView);
        imageImageView = (ImageView) findViewById(R.id.imageImageView);

        laibraryInitial();
        getData();


    }

    private void getData() {
        Call<Weather>weatherCall = weatherApi.getWeatehrData();
        weatherCall.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Weather weather = response.body();
                viewTextView.setText(weather.getQuery().getResults().getChannel().getAtmosphere().getHumidity().toString());
                Picasso.with(StartActivity.this)
                        .load(weather.getQuery().getResults().getChannel().getImage().getUrl())
                        .resize(250, 250)
                        .centerCrop()
                        .into(imageImageView);
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }

    public void laibraryInitial() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://query.yahooapis.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        weatherApi = retrofit.create(WeatherApi.class);
    }


}
