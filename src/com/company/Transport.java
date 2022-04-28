package com.company;

public class Transport {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public static void addToUpdateTyre(UpdateTyre transport) {
        transport.updateTheseTyres();
    }

    public static void addToCheckEngine(CheckEngine transport) {
        transport.checkThisEngine();
    }

    public static void addToCheckTrailer(CheckTrailer transport) {
        transport.checkThisTrailer();
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}
