package org.example;

public class Mercedes {
    private String owner;
    public int productionYear;

    public Mercedes(){}

    public Mercedes(String owner, int productionYear){
        this.owner = owner;
        this.productionYear = productionYear;
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
