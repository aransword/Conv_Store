package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutcomeDTO {
    private String OUTCOME_DATE;
    private String OUTCOME_CODE;
    private int OUTCOME_AMOUNT;

    @Override
    public String toString() {
        return "[" + OUTCOME_DATE + ", " + OUTCOME_CODE + ", " + OUTCOME_AMOUNT + "]";
    }
}
