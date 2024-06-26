package com.example.demo.mapper;

import com.example.demo.dto.CompanyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface CompanyMapper {
    void companyInsert(CompanyDTO companyDTO);
    List<CompanyDTO> companySelect();
    List<CompanyDTO> companyCodeSelect(String CODE);
    List<CompanyDTO> companyNameSelect(String NAME);
    void companyUpdate(CompanyDTO companyDTO);
    void companyCodeDelete(String CODE);
}
