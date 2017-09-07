package com.cm.xingyu.networkprogramminglearn.HandlerPackage;


import android.os.Handler;
import android.os.Message;

/**
 * Created by Administrator on 2016/12/12.
 */
public class ThreadLearn  {
    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
}
