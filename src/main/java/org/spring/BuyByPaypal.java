package org.spring;

public class BuyByPaypal implements TypeForBuyIt {

    public String email;
    public Integer password;

    public BuyByPaypal(String email, Integer password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void doBuyForProduct(float price) {
        System.out.println(price + " bu miqdarda xerclediniz");
    }
}
