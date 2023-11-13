package org.spielhagen;

import java.util.List;

class ShopService {
    private OrderRepoInterface orderRepo;
    private ProductRepo productRepo;

    // Konstruktor für den Fall, dass sowohl OrderRepoInterface als auch ProductRepo übergeben werden
    public ShopService(OrderRepoInterface orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    // Konstruktor für den Fall, dass nur OrderRepoInterface übergeben wird
    public ShopService(OrderRepoInterface orderRepo) {
        this.orderRepo = orderRepo;
    }

    // Methode zum Aufgeben einer Bestellung
    public void placeOrder(Order order) {
        List<Product> orderedProducts = order.getOrderedProducts();
        if (productRepo != null) {
            List<Product> availableProducts = productRepo.getProducts();
            if (availableProducts.containsAll(orderedProducts)) {
                orderRepo.addOrder(order);
                System.out.println("Bestellung erfolgreich aufgegeben: " + order);
            } else {
                System.out.println("Nicht alle bestellten Produkte sind verfügbar.");
            }
        } else {
            orderRepo.addOrder(order);
            System.out.println("Bestellung erfolgreich aufgegeben: " + order);
        }
    }
}
