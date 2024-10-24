package org.spring;

public class Person {

    public String name;
    public String nickname;

    private BuyProduct buyProduct;

    public BuyProduct getBuyProduct() {
        return buyProduct;
    }

    public Person(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        this.buyProduct = new BuyProduct();
    }

}
