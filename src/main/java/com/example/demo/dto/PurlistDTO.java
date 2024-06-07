package com.example.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurlistDTO {
    private String PURCHASE_CODE;
    private String PURCHASE_DATE;
    private String PRODUCT_CODE;
    private int PURCHASE_PRODUCT_QUANTITY;
    private int PURCHASE_PRODUCT_PRICE;
    private int ACC_MILEAGE;

    @Override
    public String toString() {
        return "[" + PURCHASE_CODE + ", " + PURCHASE_DATE + ", " + PRODUCT_CODE + ", " + PURCHASE_PRODUCT_QUANTITY + ", " + PURCHASE_PRODUCT_PRICE + ", " + ACC_MILEAGE + "]";
    }
}
