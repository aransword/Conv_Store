package com.example.demo.mapper;

import com.example.demo.dto.MaintainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface MaintainMapper {
    void maintainInsert(MaintainDTO maintainDTO);
    List<MaintainDTO> maintainSelect();
}
