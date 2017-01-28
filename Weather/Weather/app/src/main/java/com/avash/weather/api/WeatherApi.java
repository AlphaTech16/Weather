package com.avash.weather.api;

import com.avash.weather.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherApi {
    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"dhaka%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataDhaka();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"chittagong%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataChittagong();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"rajshahi%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataRajshahi();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"khulna%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataKhulna();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"rangpur%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataRangpur();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"sylhet%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataSylhet();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"paris%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataParis();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"london%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataLondon();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"California%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataCalifornia();

    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20" +
            "where%20text%3D\"berlin%2C%20ak\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather>getWeatherDataBerlin();

}
