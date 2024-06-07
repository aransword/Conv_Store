package com.example.demo.mapper;

import com.example.demo.dto.Order_DTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Order_Mapper {
    void order_Insert(Order_DTO order_DTO);
}
