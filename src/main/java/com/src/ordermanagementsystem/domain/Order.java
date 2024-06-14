package com.src.ordermanagementsystem.domain;

import lombok.Getter;
import java.math.BigDecimal;
import java.util.*;

@Getter
public class Order {
    @Getter
    private UUID id;
    private OrderStatus status;
    private List<OrderItem> orderItems;
    private BigDecimal price;

    public Order(final UUID id, final Product product){
        this.id = id;
        this.status = OrderStatus.CREATED;
        this.orderItems = new ArrayList<>(Collections.singletonList(new OrderItem(product)));
        this.price = product.getPrice();

    }

    private void validateState() {
        if (OrderStatus.COMPLETED.equals(status)) {
            throw new DomainException("Status is 'COMPLETED' state");
        }
    }

    private void validateProduct(final Product product) {
            if(product == null){
                throw new DomainException("The product cannot be null");
            }

        }

    public void complete(){
        this.status = OrderStatus.COMPLETED;
    }

    public OrderItem getOrderItem(UUID id){
        return orderItems.stream().filter(orderItem -> orderItem.getProductId().equals(id)).findFirst()
                .orElseThrow(() -> new DomainException("Product with " + id + " doesn't exist"));

    }

    public void removeOrder(final UUID id){
        validateState();
        final OrderItem orderItem = getOrderItem(id);
    }

    public int hashCode(){
        return Objects.hash(id, orderItems, price, status);
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(!(object instanceof Order other)) {
            return false;
        }
        return Objects.equals(id, other.id) && Objects.equals(orderItems, other.orderItems) && Objects.equals(price, other.price) && status == other.status;
    }

    private Order(){

    }

    public void addOrder(final Product product) {
        validateState();
        validateProduct(product);
        orderItems.add(new OrderItem(product));
        price = price.add(product.getPrice());

    }

}
