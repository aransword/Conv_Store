package com.example.demo.mapper;

import com.example.demo.dto.PurchaseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface PurchaseMapper {
    void purchaseInsert(PurchaseDTO purchaseDTO);
    List<PurchaseDTO> purchaseSelect();
    List<PurchaseDTO> purchaseDateSelect(String DATE);
    PurchaseDTO purchaseDateCodeSelect(PurchaseDTO purchaseDTO);
    void purchaseUpdate(PurchaseDTO purchaseDTO);
}
