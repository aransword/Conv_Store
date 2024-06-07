package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderlistDTO {
    private String ORDER_DATE;
    private String ORDER_CODE;
    private String PRODUCT_CODE;
    private int ORDER_PRODUCT_PRICE;
    private int ORDER_PRODUCT_QUANTITY;
    private String COMPANY_CODE;
}
