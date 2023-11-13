package org.spielhagen;

import java.util.List;

class Order {
    private int orderId;
    private List<Product> orderedProducts;

    public Order(int orderId, List<Product> orderedProducts) {
        this.orderId = orderId;
        this.orderedProducts = orderedProducts;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderedProducts=" + orderedProducts + "]";
    }
}
