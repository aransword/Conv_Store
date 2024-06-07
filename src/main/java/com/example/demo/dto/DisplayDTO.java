package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayDTO {
    private String PRODUCT_CODE;
    private String PRODUCT_NAME;
    private int PRODUCT_PRICE;
    private int DISPLAY_QUANTITY;
    private int PRODUCT_DC = 0;
    private String PB_PRODUCT;
    private String GIFT_PRODUCT = "";

    @Override
    public String toString() {
        return "[" + PRODUCT_CODE + ", " + PRODUCT_NAME + ", " + PRODUCT_PRICE + ", " + DISPLAY_QUANTITY + ", " + PRODUCT_DC + ", " + PB_PRODUCT + ", " + GIFT_PRODUCT + "]";
    }
}
