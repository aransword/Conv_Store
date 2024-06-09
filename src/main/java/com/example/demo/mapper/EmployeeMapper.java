package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.*;

import com.example.demo.dto.EmployeeDTO;

@Mapper
public interface EmployeeMapper {

    void employeeInsert(EmployeeDTO employeeDTO);
    List<EmployeeDTO> employeeSelect();
    EmployeeDTO employeeCodeSelect(String CODE);
    void employeeUpdate(EmployeeDTO employeeDTO);
    void employeeCodeDelete(String CODE);
}
