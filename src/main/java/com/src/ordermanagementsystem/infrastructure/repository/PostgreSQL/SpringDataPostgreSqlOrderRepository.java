package com.src.ordermanagementsystem.infrastructure.repository.PostgreSQL;

import com.src.ordermanagementsystem.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface SpringDataPostgreSqlOrderRepository extends CrudRepository<Order, UUID> {
}
