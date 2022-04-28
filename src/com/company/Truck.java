package com.company;

public class Truck extends Transport
implements UpdateTyre, CheckEngine, CheckTrailer {

    @Override
    public void checkThisEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkThisTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTheseTyres() {
        System.out.println("Меняем покрышку");
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void updateTyre(Truck truck) {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine(Truck truck) {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer(Truck truck) {
        System.out.println("Проверяем прицеп");
    }

}
