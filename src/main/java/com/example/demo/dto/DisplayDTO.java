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
    private int PRODUCT_DC;
    private String PB_PRODUCT;
    private String GIFT_PRODUCT = "";
}
