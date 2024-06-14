package com.src.ordermanagementsystem.domain.service;

import com.src.ordermanagementsystem.domain.Order;
import com.src.ordermanagementsystem.domain.Product;
import com.src.ordermanagementsystem.domain.repository.OrderRepository;

import java.util.UUID;

public class DomainOrderService implements  OrderService{

    private final OrderRepository orderRepository;

    public DomainOrderService(final OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public UUID createOrder(Product product) {
        final Order order = new Order(UUID.randomUUID(), product);
        return order.getId();
    }

    @Override
    public void addProduct(UUID id, Product product) {

        final Order order = getOrder(id);
        order.addOrder(product);
        orderRepository.save(order);
    }

    @Override
    public void completeOrder(UUID id) {
        final Order order = getOrder(id);
        order.complete();

    }

    @Override
    public void deleteProduct(UUID id, UUID productId) {

    }
    private Order getOrder(UUID id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with given id doesn't exist"));
    }
}
