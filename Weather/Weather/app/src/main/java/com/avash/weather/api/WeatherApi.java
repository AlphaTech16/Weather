package com.avash.weather.api;

import com.avash.weather.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface WeatherApi {
    @GET()
    Call<Weather>getWeatherData(@Url String url);

}
