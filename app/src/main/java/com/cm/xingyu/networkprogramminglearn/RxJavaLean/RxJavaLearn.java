package com.cm.xingyu.networkprogramminglearn.RxJavaLean;

import android.util.Log;
import android.widget.Toast;

import com.cm.xingyu.networkprogramminglearn.R;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

/**
 * Created by Administrator on 2017/8/28.
 */
public class RxJavaLearn {

BehaviorSubject behaviorSubject = BehaviorSubject.create();

    Observable observable = (Observable) Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("hello");
            subscriber.onNext("word");
            subscriber.onCompleted();
        }

    }).subscribe(new Action1<String>() {
        @Override
        public void call(String s) {

        }
    });
}
