package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LotteryDTO {
    private String LOTTERY_CODE;
    private String LOTTERY_SALE_DATE;
    private String LOTTERY_NO;
    private String EMP_CODE;

    @Override
    public String toString() {
        return "[" + LOTTERY_CODE + ", " + LOTTERY_SALE_DATE + ", " + LOTTERY_NO + ", " + EMP_CODE + "]";
    }
}
