package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.LotteryDTO;

import java.util.*;

@Mapper
public interface LotteryMapper {
    void lotteryInsert(LotteryDTO lotteryDTO);
    List<LotteryDTO> lotterySelect();
}
