package com.cm.xingyu.networkprogramminglearn.Retrofit.model;

import com.cm.xingyu.networkprogramminglearn.Retrofit.Listener.WeatherOnListener;

/**
 * Created by Administrator on 2017/7/27.
 */
public class WeatherModelImp implements WeatherModel {
    private WeatherOnListener mWeatherOnListener;
    public WeatherModelImp(WeatherOnListener mWeatherOnListener) {
        this.mWeatherOnListener = mWeatherOnListener;
    }


    @Override
    public String getWeatherData(String data, String city) {
//        Observable<WeatherData> request = com.example.admin.rxretrofitmvp.api.APIManager.getWeatherData(format, city).cache();
//
//        Subscription sub = request.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<WeatherData>() {
//                    @Override
//                    public void call(WeatherData weatherData) {
//                        mWeatherOnListener.onSuccess(weatherData);
//                    }
//                }, new Action1<Throwable>() {
//                    @Override
//                    public void call(Throwable throwable) {
//                        mWeatherOnListener.onFailure(throwable);
//                    }
//                });dat
        return data;
    }
}
