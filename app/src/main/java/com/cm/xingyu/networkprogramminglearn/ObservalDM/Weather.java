package com.cm.xingyu.networkprogramminglearn.ObservalDM;

/**
 * Created by Administrator on 2016/12/8.
 */
public class Weather {
    private String description;

    public Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Weather setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                '}';
    }
}
