package org.spring;

public class Product {

    private String seriaNo;
    private float price;


    public Product(String seriaNo, float price) {
        this.seriaNo = seriaNo;
        this.price = price;
    }

    public String getSeriaNo() {
        return seriaNo;
    }

    public void setSeriaNo(String seriaNo) {
        this.seriaNo = seriaNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
