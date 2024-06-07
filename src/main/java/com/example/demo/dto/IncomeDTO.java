package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncomeDTO {
    private String INCOME_DATE;
    private String INCOME_CODE;
    private int INCOME_AMOUNT;

    @Override
    public String toString() {
        return "[" + INCOME_DATE + ", " + INCOME_CODE + ", " + INCOME_AMOUNT + "]";
    }
}
