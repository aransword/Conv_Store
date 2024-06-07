package com.example.demo.mapper;

import com.example.demo.dto.ReturnlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface ReturnlistMapper {
    void returnlistInsert(ReturnlistDTO returnlistDTO);
    List<ReturnlistDTO> returnlistSelect();
}
