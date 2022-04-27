package com.company;

public class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public static void updateTyre(Transport transport) {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine(Transport transport) {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer(Transport transport) {
        System.out.println("Проверяем прицеп");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
