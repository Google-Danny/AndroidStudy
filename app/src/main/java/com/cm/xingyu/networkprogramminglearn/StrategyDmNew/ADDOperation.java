package com.cm.xingyu.networkprogramminglearn.StrategyDmNew;

/**
 * Created by Administrator on 2016/12/10.
 */
public class ADDOperation implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
