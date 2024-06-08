package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.IncomeDTO;

import java.util.*;

@Mapper
public interface IncomeMapper {

    void incomeInsert(IncomeDTO incomeDTO);
    List<IncomeDTO> incomeSelect();
    List<IncomeDTO> incomeDateSelect(String DATE);
    IncomeDTO incomeDateCodeSelect(IncomeDTO incomeDTO);
}
