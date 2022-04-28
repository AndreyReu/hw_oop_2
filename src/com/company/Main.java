package com.company;

public class Main {
    public static void main(String[] args) {

        Transport[] transopt = new Transport[]{
                new Car("Car1", 4),
                new Car("Car2", 4),
                new Truck("Truck1", 6),
                new Truck("Truck2", 8),
                new Bicycle("Bicycle1", 2),
                new Bicycle("Bicycle2", 2),
        };

        ServiceStation station = new ServiceStation();
        station.check((Car) transopt[0]);
        station.check((Car) transopt[1]);
        station.check((Truck) transopt[2]);
        station.check((Truck) transopt[3]);
        station.check((Bicycle) transopt[4]);
        station.check((Bicycle) transopt[5]);
    }
}
