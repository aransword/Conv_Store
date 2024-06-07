package com.example.demo.mapper;

import com.example.demo.dto.PurchaseDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseMapper {
    void purchaseInsert(PurchaseDTO purchaseDTO);
}
