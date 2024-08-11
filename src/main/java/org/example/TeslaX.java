package org.example;

public class TeslaX {
    private String owner;
    public int productionYear;

    public TeslaX(){}

    public TeslaX(String owner, int productionYear){
        this.owner = owner;
        this.productionYear = productionYear;
        System.out.println("This car belongs to " + owner + " and it was produced in " + productionYear + " year.");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
