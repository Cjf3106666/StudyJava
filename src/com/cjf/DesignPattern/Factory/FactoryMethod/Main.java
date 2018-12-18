package com.cjf.DesignPattern.Factory.FactoryMethod;

/**
 * @Descpription 工厂方法模式
 * @Author CJF
 * @Date 2018/12/18 11:23
 **/
public class Main {
    public static void main(String[] args) {
        Car car = new AudiCarFactory().getCar();
        car.run();
    }
}
