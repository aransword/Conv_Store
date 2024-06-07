package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReturnlistDTO {
    private String PURCHASE_DATE;
    private String PURCHASE_CODE;
    private String PRODUCT_CODE;
    private String RETURN_DATE;
    private int RETURN_PRICE;
    private int RETURN_QUANTITY;

    @Override
    public String toString() {
        return "[" + PURCHASE_DATE + ", " + PURCHASE_CODE + ", " + PRODUCT_CODE + ", " + RETURN_DATE + ", " + RETURN_PRICE + ", " + RETURN_QUANTITY + "]";
    }
}
