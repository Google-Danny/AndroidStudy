package com.cm.xingyu.networkprogramminglearn.ColneDM;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Person implements Cloneable {
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Person setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Person setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person person = null;
        person = (Person) super.clone();
        person.name = this.name;
        person.weight = this.weight;
        person.height = this.height;
        person.age = this.age;
        return  person;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
