package com.example.demo.mapper;

import com.example.demo.dto.MembershipDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipMapper {
    void membershipInsert(MembershipDTO membershipDTO);
}
