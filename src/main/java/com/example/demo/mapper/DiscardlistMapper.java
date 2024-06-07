package com.example.demo.mapper;

import com.example.demo.dto.DiscardlistDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DiscardlistMapper {
    void discardlistInsert(DiscardlistDTO discardlistDTO);
}
