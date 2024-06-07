package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.example.demo.dto.ATMDTO;

@Mapper
public interface ATMMapper {

    public void ATMInsert(ATMDTO atmDTO);
}
