package com.src.ordermanagementsystem.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.src.ordermanagementsystem.domain.Product;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
public class CreateOrderRequest {
    private Product product;
    @JsonCreator
    public CreateOrderRequest(@JsonProperty("product") final Product product){
        this.product = product;
    }
}
