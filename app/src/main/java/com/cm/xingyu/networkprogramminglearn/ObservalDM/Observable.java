package com.cm.xingyu.networkprogramminglearn.ObservalDM;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by Administrator on 2016/12/8.
 */
public class Observable<T> {
List<com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer<T>> mObservers = new ArrayList<com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer<T>>();


    public void register(com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer<T> observer){
        if (observer==null){
            throw new NullPointerException("observer==null");
        }
        synchronized (this){
        if(mObservers.contains(observer)){
            mObservers.add(observer);
        }
        }
    }

    public synchronized  void unregister(com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer<T> observer){
         mObservers.remove(observer);
    }

    public void notifyObservers(T data){
         for(com.cm.xingyu.networkprogramminglearn.ObservalDM.Observer<T> observer:mObservers ){
            observer.onUpdate(this,data);
         }
    }
}
