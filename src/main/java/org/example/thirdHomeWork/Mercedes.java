package org.example.thirdHomeWork;

import java.util.Objects;

public class Mercedes extends Car {
    private String owner;
    protected int productionYear;

    public Mercedes(){}

    public Mercedes(String owner, int productionYear){
        this.owner = owner;
        this.productionYear = productionYear;
        System.out.println("This Mercedes car belongs to " + owner + " and it was produced in " + productionYear + " year.");

    }

    //3rd HomeWork



    @Override
    public void speedUp() {
        System.out.println("Mercedes +10 km/h");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mercedes mercedes = (Mercedes) o;
        return productionYear == mercedes.productionYear && Objects.equals(owner, mercedes.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), owner, productionYear);
    }

    @Override
    public String toString() {
        return "Mercedes{" +
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


}
