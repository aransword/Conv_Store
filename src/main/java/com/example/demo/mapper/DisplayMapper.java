package com.example.demo.mapper;

import com.example.demo.dto.DisplayDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DisplayMapper {
    void displayInsert(DisplayDTO displayDTO);
}
