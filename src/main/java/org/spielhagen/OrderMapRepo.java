package org.spielhagen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OrderMapRepo implements OrderRepoInterface {
    private Map<Integer, Order> orderMap;

    public OrderMapRepo() {
        this.orderMap = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orderMap.put(order.getOrderId(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orderMap.remove(order.getOrderId());
    }

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(orderMap.values());
    }
}
