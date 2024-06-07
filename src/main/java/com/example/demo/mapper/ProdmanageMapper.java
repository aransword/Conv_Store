package com.example.demo.mapper;

import com.example.demo.dto.ProdmanageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface ProdmanageMapper {
    void prodmanageInsert(ProdmanageDTO prodmanageDTO);
    List<ProdmanageDTO> prodmanageSelect();
}
