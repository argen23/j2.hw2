package com.company;

public class Phone {

    private String camera;
    private int inch;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public Phone(String camera, int inch) {
        this.camera = camera;
        this.inch = inch;
    }
}
