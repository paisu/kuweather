package com.minlo.kuweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Created by minlo on 2018/10/16
 *
 * @link http://www.paisu.net
 * @description:
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public  String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
