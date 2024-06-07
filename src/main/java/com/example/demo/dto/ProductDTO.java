package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String PRODUCT_CODE;
    private String PRODUCT_NAME;
    private int PRODUCT_PRICE;
    private String PB_PRODUCT;

    @Override
    public String toString() {
        return "[" + PRODUCT_CODE + ", " + PRODUCT_NAME + ", " + PRODUCT_PRICE + ", " + PB_PRODUCT + "]";
    }
}
