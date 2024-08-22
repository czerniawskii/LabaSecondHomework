package org.example.thirdHomeWork;

import org.example.thirdHomeWork.interfaces.*;

import java.util.Objects;

public class TeslaX extends Car implements IBeep {
    private String owner;
    protected int productionYear;

    public TeslaX(){}

    //3rd HomeWork

    @Override
    public void speedUp(){
        System.out.println("TeslaX +10 km/h");
    }

    public TeslaX(String owner, int productionYear){
        this.owner = owner;
        this.productionYear = productionYear;
        System.out.println("This Tesla car belongs to " + owner + " and it was produced in " + productionYear + " year.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TeslaX teslaX = (TeslaX) o;
        return productionYear == teslaX.productionYear && Objects.equals(owner, teslaX.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), owner, productionYear);
    }


    @Override
    public String toString() {
        return "TeslaX{" +
                "owner='" + owner + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    protected String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    protected int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public void beep() {
        System.out.println("A TeslaX beeps!");
    }

    @Override
    public void doSmth() {
    }

    @Override
    public void driving() {

    }

    @Override
    public void stopNow() {

    }


    }

