package com.example.demo.mapper;

import com.example.demo.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    void productInsert(ProductDTO productDTO);
}
