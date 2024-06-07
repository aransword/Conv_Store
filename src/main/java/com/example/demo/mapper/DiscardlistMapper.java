package com.example.demo.mapper;

import com.example.demo.dto.DiscardlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface DiscardlistMapper {
    void discardlistInsert(DiscardlistDTO discardlistDTO);
    List<DiscardlistDTO> discardlistSelect();
}
