package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.IncomeDTO;

@Mapper
public interface IncomeMapper {

    void incomeInsert(IncomeDTO incomeDTO);
}
