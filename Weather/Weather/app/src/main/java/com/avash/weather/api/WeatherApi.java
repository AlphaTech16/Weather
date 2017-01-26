package com.avash.weather.api;

import com.avash.weather.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherApi {
    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"chittagong%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatehrData();
}
