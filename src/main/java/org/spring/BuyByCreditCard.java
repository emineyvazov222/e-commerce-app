package org.spring;

public class BuyByCreditCard implements TypeForBuyIt {

    String name;
    Integer cardNumber;
    Integer CVV;

    public BuyByCreditCard(String name, Integer cardNumber, Integer CVV) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
    }

    @Override
    public void doBuyForProduct(float price) {
        System.out.println(price+" bu miqdarda xerclediniz");

    }
}
