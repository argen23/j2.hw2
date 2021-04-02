package com.company;

public class Asus extends Phone implements Printable{
    private int aye;
    private String minC;

    public int getAye() {
        return aye;
    }

    public void setAye(int aye) {
        this.aye = aye;
    }

    public String getMinC() {
        return minC;
    }

    public void setMinC(String minC) {
        this.minC = minC;
    }

    public Asus(String camera, int inch, int aye, String minC) {
        super(camera, inch);
        this.aye = aye;
        this.minC = minC;
    }

    @Override
    public void print() {
        System.out.println(" дата выхода = "+getAye() +"\n country = "+getMinC()+"\n camera = "+getCamera()+"\n inches = "+getInch());
    }
}
