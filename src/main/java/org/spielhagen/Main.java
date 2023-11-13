package org.spielhagen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderRepoInterface orderRepo = new OrderMapRepo();
        ProductRepo productRepo = new ProductRepo();
        ShopService shopService = new ShopService(orderRepo, productRepo);

        Product product1 = new Product(1, "Produkt 1");
        Product product2 = new Product(2, "Produkt 2");

        List<Product> orderedProducts = new ArrayList<>();
        orderedProducts.add(product1);
        orderedProducts.add(product2);
        Order order = new Order(1, orderedProducts);

        shopService.placeOrder(order);

        OrderRepoInterface orderListRepo = new OrderListRepo();
        ShopService shopServiceWithListRepo = new ShopService(orderListRepo);

        Product product3 = new Product(3, "Produkt 3");
        Product product4 = new Product(4, "Produkt 4");

        List<Product> orderedProducts2 = new ArrayList<>();
        orderedProducts2.add(product3);
        orderedProducts2.add(product4);
        Order order2 = new Order(2, orderedProducts2);

        shopServiceWithListRepo.placeOrder(order2);
    }
}
