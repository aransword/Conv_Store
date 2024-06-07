package com.example.demo.mapper;

import com.example.demo.dto.StorageDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper {
    void storageInsert(StorageDTO storageDTO);
}
