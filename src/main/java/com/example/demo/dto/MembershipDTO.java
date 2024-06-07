package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MembershipDTO {
    private String MEMBERSHIP_CODE;
    private String MEMBERSHIP_NAME;
    private int MEMBERSHIP_AGE;
    private String MEMBERSHIP_GENDER;
    private String MEMBERSHIP_MAIL_NO;
    private String MEMBERSHIP_PHONE_NO;
    private int MEMBERSHIP_MILEAGE;
}
