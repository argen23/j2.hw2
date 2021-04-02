package com.company;

public class Xiaomi extends Phone implements Printable{
    private int maH;
    private int antennas;

    public int getMaH() {
        return maH;
    }

    public Xiaomi(String camera, int inch, int maH, int antennas) {
        super(camera, inch);
        this.maH = maH;
        this.antennas = antennas;
    }

    public void setMaH(int maH) {
        this.maH = maH;
    }

    public int getAntennas() {
        return antennas;
    }

    public void setAntennas(int antennas) {
        this.antennas = antennas;
    }

    public int auto(String UWU , int mah){
        return antennas+maH;
    }

    @Override
    public void print() {
        System.out.println(" antennas = " + getAntennas() + "\n MaH = " + getMaH() + " \n camera = " + getCamera() + "\n inches =  " +getInch() );
    }
}
