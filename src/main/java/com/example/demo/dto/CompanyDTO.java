package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDTO {
    private String COMPANY_CODE;
    private String COMPANY_NAME;
    private String COMPANY_PHONE_NO;
    private String COMPANY_MAIL_NO;

    @Override
    public String toString() {
        return "[" + COMPANY_CODE + ", " + COMPANY_NAME + ", " + COMPANY_PHONE_NO + ", " + COMPANY_MAIL_NO + "]";
    }
}
