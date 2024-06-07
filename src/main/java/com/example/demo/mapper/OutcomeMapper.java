package com.example.demo.mapper;

import com.example.demo.dto.OutcomeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface OutcomeMapper {
    void outcomeInsert(OutcomeDTO outcomeDTO);
    List<OutcomeDTO> outcomeSelect();
}
