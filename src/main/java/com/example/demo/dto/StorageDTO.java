package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StorageDTO {
    private String PRODUCT_CODE;
    private String PRODUCT_NAME;
    private int PRODUCT_PRICE;
    private int STORAGE_QUANTITY;
    private int PRODUCT_DC;
    private String PB_PRODUCT;
}
