package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PurchaseDTO {
    private String PURCHASE_CODE;
    private String PURCHASE_DATE;
    private String MEMBERSHIP_CODE = "";
    private int PURCHASE_AMOUNT;
    private String CARD_ACCOUNT_NO = "";
    private int CARD_PURCHASE_AMOUNT = 0;
    private String VOUCHER_NO = "";
    private int VOUCHER_PURCHASE_AMOUNT = 0;
    private String COUPON_NO = "";
    private int COUPON_PURCHASE_AMOUNT = 0;
    private int CASH_PURCHASE_AMOUNT = 0;
    private int USE_MILEAGE = 0;
    private int PURCHASE_MILEAGE = 0;
    private String EMP_CODE;
}
