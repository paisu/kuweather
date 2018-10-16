package com.minlo.kuweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by minlo on 2018/10/16
 *
 * @link http://www.paisu.net
 * @description:
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
