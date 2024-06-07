package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.*;

import com.example.demo.dto.EmployeeDTO;

@Mapper
public interface EmployeeMapper {

    public void employeeInsert(EmployeeDTO employeeDTO);
}
