package com.cm.xingyu.networkprogramminglearn.ObservalDM;

import java.util.*;

/**
 * Created by Administrator on 2016/12/8.
 */
public interface Observer<T> {

    void onUpdate(Observable<T> observable, T data);

}
