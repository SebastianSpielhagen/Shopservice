package org.spielhagen;

import java.util.ArrayList;
import java.util.List;

class OrderListRepo implements OrderRepoInterface {
    private final List<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }
}