package com.cm.xingyu.networkprogramminglearn.BuilderDM;


/**
 * Created by Administrator on 2016/12/8.
 */
public class MeiMei {

    private String name;
    private String age;
    private Double height;
    private Double weight;
    private String work;

    public MeiMei(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.work = builder.work;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

  public static  class  Builder{
        private String name;
        private String age;
        private Double height;
        private Double weight;
        private String work;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder height(Double height) {
            this.height = height;
            return this;
        }

        public Builder weight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Builder work(String work) {
            this.work = work;
            return this;
        }

        public MeiMei build(){
            return new MeiMei(this);
        }
    }
}