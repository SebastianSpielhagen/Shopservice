package org.spielhagen;

import java.util.List;

record Order(int orderId, List<Product> orderedProducts) {

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderedProducts=" + orderedProducts + "]";
    }
}