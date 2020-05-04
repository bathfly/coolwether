package com.example.asus.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ASUS on 2020/4/26.
 * 发送OkHttp连接服务器请求
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback ) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
