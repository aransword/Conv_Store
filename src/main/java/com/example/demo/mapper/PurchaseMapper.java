package com.example.demo.mapper;

import com.example.demo.dto.PurchaseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface PurchaseMapper {
    void purchaseInsert(PurchaseDTO purchaseDTO);
    List<PurchaseDTO> purchaseSelect();
}
