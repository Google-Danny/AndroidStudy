package com.cm.xingyu.networkprogramminglearn.Retrofit.api;

import com.cm.xingyu.networkprogramminglearn.Retrofit.bean.WeatherData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/7/27.
 */
public interface APIManagerService {
    @GET("/weather/index")
    Observable<WeatherData> getWeatherData(@Query("format") String format,@Query("cityname")String cityname,@Query("key") String key );
}
