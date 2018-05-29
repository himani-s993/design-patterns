package com.dp;

public class Phone {
    private String os;
    private String ram;
    private String battery;

    public Phone() {
    }

    public Phone(String os, String ram, String battery) {
        this.os = os;
        this.ram = ram;
        this.battery = battery;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("os='").append(os).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", battery='").append(battery).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
