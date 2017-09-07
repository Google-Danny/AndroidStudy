package com.cm.xingyu.networkprogramminglearn.Retrofit.api;

import com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer;
import com.cm.xingyu.networkprogramminglearn.Retrofit.bean.WeatherData;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/7/27.
 */
public class APIManager {
    private static  final  String ENDPOINT = "http://v.juhe.com";
    private static  final Retrofit sRetrofit = new Retrofit.Builder()
            .baseUrl(ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
    private  static  final  APIManagerService apiManager = sRetrofit.create(APIManagerService.class);

    
   public  static Observer<WeatherData > getWeatherData (String format,String  city){
       return
               (Observer<WeatherData>) apiManager.getWeatherData(format,city,"");
   }
}
