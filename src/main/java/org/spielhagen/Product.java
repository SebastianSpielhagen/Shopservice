package org.spielhagen;

class Product {
    private final int productId;
    private final String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

   @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + "]";
    }
}