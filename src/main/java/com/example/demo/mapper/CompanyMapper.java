package com.example.demo.mapper;

import com.example.demo.dto.CompanyDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {
    void companyInsert(CompanyDTO companyDTO);
}
