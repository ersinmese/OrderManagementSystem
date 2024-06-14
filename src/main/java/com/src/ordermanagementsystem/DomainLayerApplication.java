package com.src.ordermanagementsystem.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;



@SpringBootApplication
@PropertySource("classpath:application.properties")
public class DomainLayerApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(DomainLayerApplication.class);
        application.run(args);
    }
    @Autowired
    public ConfigurableApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        orderController.createCompleteOrder();
        orderController.createIncompleteOrder();
        // uncomment to stop the context when execution is done
        // context.close();
    }
}
