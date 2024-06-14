package com.src.ordermanagementsystem.infrastructure.configuration;

import com.src.ordermanagementsystem.OrderManagementSystemApplication;
import com.src.ordermanagementsystem.domain.repository.OrderRepository;
import com.src.ordermanagementsystem.domain.service.DomainOrderService;
import com.src.ordermanagementsystem.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = OrderManagementSystemApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository){
        return new DomainOrderService(orderRepository);
    }
}
