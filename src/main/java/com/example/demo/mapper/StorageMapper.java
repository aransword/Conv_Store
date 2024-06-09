package com.example.demo.mapper;

import com.example.demo.dto.StorageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface StorageMapper {
    void storageInsert(StorageDTO storageDTO);
    List<StorageDTO> storageSelect();
    StorageDTO storageNameSelect(String NAME);
    StorageDTO storageCodeSelect(String CODE);
    void storageUpdate(StorageDTO storageDTO);
    void storageCodeDelete(String CODE);
}
