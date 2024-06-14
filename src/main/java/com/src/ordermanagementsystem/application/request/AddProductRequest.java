package com.src.ordermanagementsystem.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.src.ordermanagementsystem.domain.Product;
import lombok.Getter;

@Getter
public class AddProductRequest {

    private Product product;
    @JsonCreator
    public AddProductRequest(@JsonProperty("product") final Product product){
        this.product = product;
    }
}
