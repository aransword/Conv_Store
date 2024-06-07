package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ATMDTO {
    private String ATM_USE_DATE;
    private String ATM_CODE;
    private String DNW_TYPE_CODE;
    private String ATM_ACCOUNT_NO;
    private int DNW_AMOUNT;
    private String EMP_CODE;

    @Override
    public String toString() {
        return "[" + ATM_USE_DATE + ", " + ATM_CODE + ", " + DNW_TYPE_CODE + ", " + ATM_ACCOUNT_NO + ", " + DNW_AMOUNT + ", " + EMP_CODE + "]";
    }
}
