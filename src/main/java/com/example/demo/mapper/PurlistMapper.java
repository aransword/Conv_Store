package com.example.demo.mapper;

import com.example.demo.dto.PurlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface PurlistMapper {
    void purlistInsert(PurlistDTO purlistDTO);
    List<PurlistDTO> purlistSelect();
    List<PurlistDTO> purlistDateCodeSelect(PurlistDTO purlistDTO);
    PurlistDTO purlistDateCodePcodeSelect(PurlistDTO purlistDTO);
}
