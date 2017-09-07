package com.cm.xingyu.networkprogramminglearn.StrategyDM;

/**
 * Created by Administrator on 2016/12/9.
 */
public class TravelContext {
    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public TravelContext setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public void travel(){
        if(strategy!=null){
            strategy.travel();
        }
    }
}
