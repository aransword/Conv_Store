package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscardlistDTO {
    private String DISCARD_DATE;
    private String DISCARD_TYPE_CODE;
    private int DISCARD_QUANTITY;
    private String EMP_CODE;
    private String PRODUCT_CODE;

    @Override
    public String toString() {
        return "[" + DISCARD_DATE + ", " + DISCARD_TYPE_CODE + ", " + DISCARD_QUANTITY + ", " + EMP_CODE + ", " + PRODUCT_CODE + "]";
    }
}
