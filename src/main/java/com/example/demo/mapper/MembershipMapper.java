package com.example.demo.mapper;

import com.example.demo.dto.MembershipDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface MembershipMapper {
    void membershipInsert(MembershipDTO membershipDTO);
    List<MembershipDTO> membershipSelect();
}
