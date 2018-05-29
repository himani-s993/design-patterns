package com.dp;

public class PhoneBuilder {
    private String os;
    private String ram;
    private String battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    Phone getPhone() {
        return new Phone(os, ram, battery);
    }
}
