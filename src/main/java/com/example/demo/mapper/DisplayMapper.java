package com.example.demo.mapper;

import com.example.demo.dto.DisplayDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface DisplayMapper {
    void displayInsert(DisplayDTO displayDTO);
    List<DisplayDTO> displaySelect();
    DisplayDTO displayCodeSelect(String CODE);
    DisplayDTO displayNameSelect(String NAME);
    void displayUpdate(DisplayDTO displayDTO);
    void displayCodeDelete(String CODE);
}
