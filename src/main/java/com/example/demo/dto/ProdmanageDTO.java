package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdmanageDTO {
    private String MANAGE_DATE;
    private String MANAGE_TYPE_CODE;
    private int ERROR_QUANTITY;
    private String ERROR_REASON;
    private String PRODUCT_CODE;
    private String EMP_CODE;
}
