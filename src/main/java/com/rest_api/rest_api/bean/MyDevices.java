package com.rest_api.rest_api.bean;

import com.rest_api.rest_api.model.Device;

public class MyDevices {
    private Iterable<Device> devices;
    private int sum;

    public Iterable<Device> getDevices() {
        return devices;
    }

    public void setDevices(Iterable<Device> devices) {
        this.devices = devices;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public MyDevices(Iterable<Device> devices, int sum) {
        this.devices = devices;
        this.sum = sum;
    }
}
