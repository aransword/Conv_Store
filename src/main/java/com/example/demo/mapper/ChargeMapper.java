package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.ChargeDTO;

import java.util.*;

@Mapper
public interface ChargeMapper {

    void chargeInsert(ChargeDTO chargeDTO);
    List<ChargeDTO> chargeSelect();
    List<ChargeDTO> chargeDateSelect(String DATE);
    ChargeDTO chargeDateCodeSelect(ChargeDTO chargeDTO);
    List<ChargeDTO> chargePayerSelect(String PAYER);
}
