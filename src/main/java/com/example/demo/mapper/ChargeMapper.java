package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.ChargeDTO;

@Mapper
public interface ChargeMapper {

    void chargeInsert(ChargeDTO chargeDTO);
}
