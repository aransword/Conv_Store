package com.example.demo.mapper;

import com.example.demo.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface ProductMapper {
    void productInsert(ProductDTO productDTO);
    List<ProductDTO> productSelect();
    ProductDTO productCodeSelect(String CODE);
    void productUpdate(ProductDTO productDTO);
}
