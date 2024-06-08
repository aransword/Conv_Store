package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.ATMDTO;

import java.util.*;

@Mapper
public interface ATMMapper {
    void ATMInsert(ATMDTO atmDTO);
    List<ATMDTO> ATMSelect();
    List<ATMDTO> ATMDateSelect(String DATE);
    ATMDTO ATMDateCodeSelect(ATMDTO atmDTO);
}
