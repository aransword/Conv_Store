package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.DeliveryDTO;

import java.util.*;

@Mapper
public interface DeliveryMapper {
    void deliveryInsert(DeliveryDTO deliveryDTO);
    List<DeliveryDTO> deliverySelect();
    List<DeliveryDTO> deliveryDateCodeSelect(DeliveryDTO deliveryDTO);
    List<DeliveryDTO> deliverySenderSelect(String SENDER);
}
