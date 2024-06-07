package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {
    private String EMP_CODE;
    private String EMP_NAME;
    private int EMP_AGE;
    private String EMP_GENDER;
    private String EMP_PHONE_NO;
    private String EMP_MAIL_NO;
    private String EMP_ACCOUNT_NO;
    private String PART;
    private int SALARY;

    @Override
    public String toString() {
        return "[EMP_CODE=" + EMP_CODE + ", EMP_NAME=" + EMP_NAME + ", EMP_AGE=" + EMP_AGE + ", EMP_GENDER=" + EMP_GENDER + ", EMP_PHONE_NO=" + EMP_PHONE_NO + ", EMP_MAIL_NO=" + EMP_MAIL_NO + ", EMP_ACCOUNT_NO=" + EMP_ACCOUNT_NO + ", PART=" + PART + ", SALARY=" + SALARY + "]";
    }
}
