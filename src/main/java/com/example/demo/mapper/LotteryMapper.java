package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.dto.LotteryDTO;

@Mapper
public interface LotteryMapper {
    void lotteryInsert(LotteryDTO lotteryDTO);
}
