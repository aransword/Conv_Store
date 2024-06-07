package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.example.demo.dto.ChargeDTO;

@Mapper
public interface ChargeMapper {

    public void chargeInsert(ChargeDTO chargeDTO);
}
