package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaintainDTO {
    private String MAINTAIN_CODE;
    private String MAINTAIN_DATE;
    private int MAINTAIN_AMOUNT;
    private String EMP_CODE = "";

    @Override
    public String toString() {
        return "[" + MAINTAIN_DATE + ", " + MAINTAIN_CODE + ", " + MAINTAIN_AMOUNT + ", " + EMP_CODE + "]";
    }
}
