package com.example.demo.mapper;

import com.example.demo.dto.Order_DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface Order_Mapper {
    void order_Insert(Order_DTO order_DTO);
    List<Order_DTO> order_Select();
    Order_DTO order_DateCodeSelect(Order_DTO order_DTO);
    List<Order_DTO> order_DateSelect(String DATE);
    void order_Update(Order_DTO order_DTO);
}
