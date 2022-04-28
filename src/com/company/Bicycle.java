package com.company;

public class Bicycle extends Transport
implements UpdateTyre {

    @Override
    public void updateTheseTyres() {
        System.out.println("Меняем покрышку");
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void updateTyre(Bicycle bicycle) {
        System.out.println("Меняем покрышку");
    }

}

