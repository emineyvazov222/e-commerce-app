package org.spring;

import java.util.ArrayList;
import java.util.List;

public class BuyProduct {

    List<Product> products = new ArrayList<>();

    public void productAdd(Product product) {
        products.add(product);

    }

    public boolean productRemove(Product product) {
        return products.remove(product);
    }

    public float generalPrice() {
        float gPrice = 0;
        for (Product product: products){
            gPrice+= product.getPrice();
        }
        return gPrice;
    }

    public void paying(TypeForBuyIt typeForBuyIt){
        typeForBuyIt.doBuyForProduct(generalPrice());
    }

}
