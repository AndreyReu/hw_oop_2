package com.company;

public class ServiceStation {

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            Transport.addToUpdateTyre(car);
            break;
        }
        Transport.addToCheckEngine(car);
        System.out.println();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            Transport.addToUpdateTyre(truck);
            break;
        }
        Transport.addToCheckEngine(truck);
        Transport.addToCheckTrailer(truck);
        System.out.println();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            Transport.addToUpdateTyre(bicycle);
            break;
        }
        System.out.println();
    }
}

