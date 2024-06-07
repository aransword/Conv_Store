package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChargeDTO {
    private String PAY_DATE;
    private String CHARGE_CODE;
    private String INST_NAME;
    private String CHARGE_NAME;
    private String PAYER;
    private int PAY_AMOUNT;
    private String EMP_CODE;
}
