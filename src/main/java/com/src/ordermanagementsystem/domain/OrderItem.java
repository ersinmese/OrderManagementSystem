package com.src.ordermanagementsystem.domain;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Getter
public class OrderItem {
    private UUID productId;
    private BigDecimal price;

    public OrderItem(final Product product){
        this.productId = product.getId();
        this.price = product.getPrice();
    }

    private OrderItem(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(productId, orderItem.productId) && Objects.equals(price, orderItem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, price);
    }


}
