package com.example.asus.coolweather.gson;

/**
 * Created by ASUS on 2020/5/2.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
