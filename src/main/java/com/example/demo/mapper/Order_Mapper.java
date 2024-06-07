package com.example.demo.mapper;

import com.example.demo.dto.Order_DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface Order_Mapper {
    void order_Insert(Order_DTO order_DTO);
    List<Order_DTO> order_Select();
}
