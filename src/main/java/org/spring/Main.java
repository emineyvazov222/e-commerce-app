package org.spring;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("123abc", 123);
        Product product2 = new Product("456def", 99);

        Person emin = new Person("Emin", "Eyvazov");

        BuyProduct buyProduct = emin.getBuyProduct();
        buyProduct.productAdd(product1);
        buyProduct.productAdd(product2);
        buyProduct.productRemove(product1);

        buyProduct.paying(new BuyByCreditCard("Emin", 123456, 234));

        // or use following code snippet
        buyProduct.paying(new BuyByPaypal("eyvazov550@gmail.com",550));

    }
}
