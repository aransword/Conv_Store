package com.example.demo.mapper;

import com.example.demo.dto.OutcomeDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OutcomeMapper {
    void outcomeInsert(OutcomeDTO outcomeDTO);
}
