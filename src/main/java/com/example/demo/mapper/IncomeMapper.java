package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.example.demo.dto.IncomeDTO;

@Mapper
public interface IncomeMapper {

    public void incomeInsert(IncomeDTO incomeDTO);
}
