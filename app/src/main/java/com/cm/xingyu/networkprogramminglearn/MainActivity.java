package com.cm.xingyu.networkprogramminglearn;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cm.xingyu.networkprogramminglearn.BuilderDM.MeiMei;
import com.cm.xingyu.networkprogramminglearn.ColneDM.Person;
import com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer;
import com.cm.xingyu.networkprogramminglearn.ObservalDM.Weather;
import com.cm.xingyu.networkprogramminglearn.RxJavaLean.RxJava;
import com.cm.xingyu.networkprogramminglearn.StrategyDM.TravelContext;
import com.cm.xingyu.networkprogramminglearn.StrategyDM.WalkStrategy;
import com.cm.xingyu.networkprogramminglearn.StrategyDmNew.ADDOperation;
import com.cm.xingyu.networkprogramminglearn.StrategyDmNew.ContextStrategy;
import com.cm.xingyu.networkprogramminglearn.StrategyDmNew.Strategy;


public class MainActivity extends Activity  implements View.OnClickListener{
    private Button  getMessageBT,putMessageBt;
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume","onResume");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("onRestoreInstanceState","onRestoreInstanceState");
        Log.e("getGood",savedInstanceState.getString("good"));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("onSaveInstanceState","onSaveInstanceState");
        outState.putString("good","23333");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Notification.Builder locaBuilder = new Notification.Builder(this);
        locaBuilder.setContentIntent(PendingIntent.getActivity(this,0,new Intent(this,MainActivity.class),0));
        locaBuilder.setAutoCancel(false);
        locaBuilder.setTicker("foreground Service start");
        locaBuilder.setContentTitle("socket 服务端");
        locaBuilder.setContentText("正在运行...");
        Log.e("onCreate","onCreate");
        setContentView(R.layout.activity_main);
        putMessageBt = (Button) findViewById(R.id.alpha);
        getMessageBT = (Button) findViewById(R.id.scale);
        putMessageBt.setOnClickListener(this);
        getMessageBT.setOnClickListener(this);

//        BuilderTest();//构造者模式
//        ObservaleTest();//观察者模式
//        RxjavaTest();//Rx练习
//        StrategyTest();
        StrategyNewTest();
//        try {
//            CloneTest();//原型模式
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        try {
//            Inet4Address inet4Address = (Inet4Address) Inet4Address.getByName("www.baidu.com");
//            Log.d("ffff", String.valueOf(inet4Address));
//            Socket socket = new Socket("192.168.10.116", 80);
//
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    private void getMsg(){
        Uri uri = Uri.parse("content://sms/");
        ContentResolver resolver = getContentResolver();
        Cursor cursor = resolver.query(uri, new String[]{"address","date","type","body"}, null, null, null);
        while (cursor.moveToNext()){
            String address = cursor.getString(0);
            String date = cursor.getString(1);
            String type = cursor.getString(2);
            String body = cursor.getString(3);
            System.out.println("地址:" + address);
            System.out.println("时间:" + date);
            System.out.println("类型:" + type);
            System.out.println("内容:" + body);
            System.out.println("======================");
            Log.e("HeHe", "我的天~");
        }
        cursor.close();
    }

    private void insertMsg(){
        ContentResolver resolver = getContentResolver();
        Uri uri = Uri.parse("content://sms/");
        ContentValues conValues = new ContentValues();
        conValues.put("address", "123456789");
        conValues.put("type", 1);
        conValues.put("date", System.currentTimeMillis());
        conValues.put("body", "no zuo no die why you try!");
        resolver.insert(uri, conValues);
        Log.e("HeHe", "短信插入完毕~");
    }


    private void StrategyNewTest() {
        ContextStrategy context = new ContextStrategy(new ADDOperation());
        context.executeDoOperation(10,5);
        Log.d("aaa", String.valueOf(context.executeDoOperation(10,5)));
    }




    private void CloneTest() throws CloneNotSupportedException {




    }

    private void ObservaleTest() {
        com.cm.xingyu.networkprogramminglearn.ObservalDM.Observable<Weather> observable = new com.cm.xingyu.networkprogramminglearn.ObservalDM.Observable<Weather>();
        Observer<Weather> observer1 = new Observer<Weather>() {
            @Override
            public void onUpdate(com.cm.xingyu.networkprogramminglearn.ObservalDM.Observable<Weather> observable, Weather data) {
                Log.d("观察者1", data.toString());
            }
        };

        Observer<Weather> observer2 = new Observer<Weather>() {
            @Override
            public void onUpdate(com.cm.xingyu.networkprogramminglearn.ObservalDM.Observable<Weather> observable, Weather data) {
                Log.d("观察者", data.toString());
            }
        };
        observable.register(observer1);
        observable.register(observer2);

        Weather weather = new Weather("晴转多云");
        observable.notifyObservers(weather);

        Weather weather1 = new Weather("多云转阴");
        observable.notifyObservers(weather1);
        observable.unregister(observer1);

        Weather weather2 = new Weather("下雪");
        observable.notifyObservers(weather2);
    }

    private void BuilderTest() {
        MeiMei.Builder builder = new MeiMei.Builder();
        MeiMei meimei = builder.name("二胡妹妹")
                .age("23").height(168.0).weight(60.0).build();
        MeiMei meimeiNew = builder.name("舞蹈妹妹")
                .age("23").height(161.0).weight(50.0).build();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alpha:
                insertMsg();
                break;
            case R.id.scale:
                getMsg();
                break;
            default:
                break;
        }
    }
}
