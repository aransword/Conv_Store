package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryDTO {
    private String DELIVERY_DATE;
    private String DELIVERY_CODE;
    private String SENDER;
    private String RECEIVER;
    private String SOURCE;
    private String DEST;
    private String DELIVERY_CONTENT;
    private String CURRENT_STATUS;
    private int DELIVERY_AMOUNT;
    private String EMP_CODE;

    @Override
    public String toString() {
        return "[" + DELIVERY_DATE + ", " + DELIVERY_CODE + ", " + SENDER + ", " + RECEIVER + ", " + SOURCE + ", " + DEST + ", " + DELIVERY_CONTENT + ", " + CURRENT_STATUS + ", " + DELIVERY_AMOUNT + ", " + EMP_CODE + "]";
    }
}
