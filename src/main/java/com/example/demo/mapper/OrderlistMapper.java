package com.example.demo.mapper;

import com.example.demo.dto.OrderlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface OrderlistMapper {
    void orderlistInsert(OrderlistDTO orderlistDTO);
    List<OrderlistDTO> orderlistSelect();
    List<OrderlistDTO> orderlistDateSelect(String DATE);
    List<OrderlistDTO> orderlistDateCodeSelect(OrderlistDTO orderlistDTO);
    OrderlistDTO orderlistDateCodePcodeSelect(OrderlistDTO orderlistDTO);
    void orderlistUpdate(OrderlistDTO orderlistDTO);
}
