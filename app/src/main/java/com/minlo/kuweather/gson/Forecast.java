package com.minlo.kuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by minlo on 2018/10/16
 *
 * @link http://www.paisu.net
 * @description:
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {
        public String max;
        public String min;
    }
}
