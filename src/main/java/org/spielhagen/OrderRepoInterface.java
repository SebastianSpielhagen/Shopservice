package org.spielhagen;

import java.util.List;

interface OrderRepoInterface {
    void addOrder(Order order);

    void removeOrder(Order order);

    List<Order> getOrders();
}
