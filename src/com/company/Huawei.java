package com.company;

public class Huawei extends Phone implements Printable{
    private String minC;
    private int rpgTest;

    public String getMinC() {
        return minC;
    }

    public void setMinC(String minC) {
        this.minC = minC;
    }

    public int getRpgTest() {
        return rpgTest;
    }

    public void setRpgTest(int rpgTest) {
        this.rpgTest = rpgTest;
    }

    public Huawei(String camera, int inch, String minC, int rpgTest) {
        super(camera, inch);
        this.minC = minC;
        this.rpgTest = rpgTest;
    }

    @Override
    public void print() {
        System.out.println( " made in = " + getMinC() + "\n очки теста по rpg = " + getRpgTest() + "\n camera =  " +
                getCamera() + "\n inches = " + getInch());
    }
}

