package com.minlo.kuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by minlo on 2018/10/16
 *
 * @link http://www.paisu.net
 * @description:
 */
public class Now {
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
