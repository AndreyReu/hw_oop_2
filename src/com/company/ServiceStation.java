package com.company;

public class ServiceStation {

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            Transport.updateTyre(car);
            break;
        }
        Transport.checkEngine(car);
        System.out.println();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            Transport.updateTyre(truck);
            break;
        }
        Transport.checkEngine(truck);
        Transport.checkTrailer(truck);
        System.out.println();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            Transport.updateTyre(bicycle);
            break;
        }
        System.out.println();
    }
}

