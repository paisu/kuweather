package com.minlo.kuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by minlo on 2018/10/16
 *
 * @link http://www.paisu.net
 * @description:
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
