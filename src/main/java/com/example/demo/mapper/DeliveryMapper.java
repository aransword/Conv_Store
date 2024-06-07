package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.DeliveryDTO;

@Mapper
public interface DeliveryMapper {
    void deliveryInsert(DeliveryDTO deliveryDTO);
}
