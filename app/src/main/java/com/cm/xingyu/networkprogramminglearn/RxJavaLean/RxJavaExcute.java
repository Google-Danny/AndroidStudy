package com.cm.xingyu.networkprogramminglearn.RxJavaLean;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cm.xingyu.networkprogramminglearn.R;

import rx.Subscriber;

public class RxJavaExcute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java_excute);
        RxJava rxJava = new RxJava();
        RxJavaExcute rxJavaExcute = new RxJavaExcute();
        rxJava.ob.subscribe(rxJava.mySubscriber);
        rxJava.ob.subscribe(rxJavaExcute.subscriber);
//        Build build = new Build();
//        Log.d("test", build.toString());
    }

    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {
            Log.d("eeee", s);
        }
    };
}
