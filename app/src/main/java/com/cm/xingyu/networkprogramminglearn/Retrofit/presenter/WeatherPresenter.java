package com.cm.xingyu.networkprogramminglearn.Retrofit.presenter;

/**
 * Created by Administrator on 2017/7/27.
 */
public  abstract  class WeatherPresenter extends  BasePresenter {
    public abstract void getWeatherData(String format, String city);
}
