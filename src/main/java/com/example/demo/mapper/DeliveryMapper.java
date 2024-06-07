package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;

@Mapper
public interface DeliveryMapper {
    public void deliveryInsert(Map<String,Object> map);
}
