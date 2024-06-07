package com.example.demo.mapper;

import com.example.demo.dto.CompanyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface CompanyMapper {
    void companyInsert(CompanyDTO companyDTO);
    List<CompanyDTO> companySelect();
}
