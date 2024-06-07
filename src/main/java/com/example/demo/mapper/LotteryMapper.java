package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.example.demo.dto.LotteryDTO;

@Mapper
public interface LotteryMapper {
    public void lotteryInsert(LotteryDTO lotteryDTO);
}
