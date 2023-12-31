package org.spielhagen;

import java.util.ArrayList;
import java.util.List;

class ProductRepo {
    private final List<Product> products;

    public ProductRepo() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}