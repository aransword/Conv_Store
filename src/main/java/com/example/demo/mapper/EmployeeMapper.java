package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;


import com.example.demo.dto.EmployeeDTO;

@Mapper
public interface EmployeeMapper {

    void employeeInsert(EmployeeDTO employeeDTO);
}
