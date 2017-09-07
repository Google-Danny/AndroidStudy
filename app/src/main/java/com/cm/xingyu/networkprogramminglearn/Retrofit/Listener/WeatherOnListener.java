package com.cm.xingyu.networkprogramminglearn.Retrofit.Listener;

import com.cm.xingyu.networkprogramminglearn.Retrofit.bean.WeatherData;

/**
 * Created by Administrator on 2017/7/27.
 */
public interface WeatherOnListener {
    void onSuccess(WeatherData s);
    void onFailure(Throwable e);
}
