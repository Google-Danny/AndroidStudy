package com.cm.xingyu.networkprogramminglearn.RxJavaLean;

import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Single;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/12/9.
 */
public class RxJava {

    Subscriber<String> mySubscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onNext(String s) {
            Log.d("eeeeeee", s);
        }
    };

    Observable ob = (Observable) Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("hello");
            subscriber.onNext("world");
            subscriber.onNext("good");
            subscriber.onCompleted();
        }

    });


}
