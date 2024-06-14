package com.src.ordermanagementsystem.infrastructure.configuration;

import com.src.ordermanagementsystem.infrastructure.repository.PostgreSQL.SpringDataPostgreSqlOrderRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = SpringDataPostgreSqlOrderRepository.class)
public class PostgreSqlConfiguration {
}
