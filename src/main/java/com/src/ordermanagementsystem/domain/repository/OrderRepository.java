package com.src.ordermanagementsystem.domain.repository;

import com.src.ordermanagementsystem.domain.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Optional<Order> findById(UUID id);

    void save(Order order);
}
