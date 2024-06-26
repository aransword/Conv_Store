package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order_DTO {
    private String ORDER_DATE;
    private String ORDER_CODE;
    private int ORDER_AMOUNT;

    @Override
    public String toString() {
        return "[" + ORDER_CODE + ", " + ORDER_DATE + ", " + ORDER_AMOUNT + "]";
    }
}
