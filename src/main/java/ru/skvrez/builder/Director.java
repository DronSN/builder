package ru.skvrez.builder;

import ru.skvrez.builder.builders.BuildDevice;

public class Director {
    private BuildDevice buildDevice;

    public Director(BuildDevice buildDevice) {
        this.buildDevice = buildDevice;
    }

    public void changeBuildDevice(BuildDevice buildDevice) {
        this.buildDevice = buildDevice;
    }

    public void make() {
        buildDevice.reset();
        buildDevice.setMotherBoard();
        buildDevice.setStorage();
        buildDevice.installAllToCase();
    }
}
