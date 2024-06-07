package com.example.demo.mapper;

import com.example.demo.dto.OrderlistDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderlistMapper {
    void orderlistInsert(OrderlistDTO orderlistDTO);
}
