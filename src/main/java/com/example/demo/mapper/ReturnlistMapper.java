package com.example.demo.mapper;

import com.example.demo.dto.ReturnlistDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReturnlistMapper {
    void returnlistInsert(ReturnlistDTO returnlistDTO);
}
