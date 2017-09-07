package com.cm.xingyu.networkprogramminglearn.StrategyDmNew;

/**
 * Created by Administrator on 2016/12/10.
 */
public class ContextStrategy {
    private Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeDoOperation(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
