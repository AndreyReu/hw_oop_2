package com.company;

public class Car extends Transport
implements UpdateTyre, CheckEngine {

    @Override
    public void checkThisEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTheseTyres() {
        System.out.println("Меняем покрышку");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void updateTyre(Car car) {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine(Car car) {
        System.out.println("Проверяем двигатель");
    }
}
