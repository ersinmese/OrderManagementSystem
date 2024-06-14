package com.src.ordermanagementsystem.infrastructure.repository.PostgreSQL;

import com.src.ordermanagementsystem.domain.Order;
import com.src.ordermanagementsystem.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.util.UUID;

@Component
@ConditionalOnMissingBean(OrderRepository.class)
@Primary
public class PostgreSqlDbOrderRepository implements OrderRepository {

    private final SpringDataPostgreSqlOrderRepository orderRepository;

    @Autowired
    public PostgreSqlDbOrderRepository(final SpringDataPostgreSqlOrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void save(Order order) {

    }
}
