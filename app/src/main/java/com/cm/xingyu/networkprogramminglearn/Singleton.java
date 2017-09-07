package com.cm.xingyu.networkprogramminglearn;

import android.os.IBinder;

/**
 * Created by Administrator on 2016/12/8.
 */
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {

    }

    private static Singleton getInstance() {
        if(instance==null){
           synchronized(Singleton.class){
               if (instance==null){
                   instance = new Singleton();
               }
           }
        }
        return instance;
    }
}
