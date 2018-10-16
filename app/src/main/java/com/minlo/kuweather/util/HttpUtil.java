package com.minlo.kuweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by minlo on 2018/10/15
 *
 * @link http://www.paisu.net
 * @description:
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
