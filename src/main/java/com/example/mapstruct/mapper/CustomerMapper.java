package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.CustomerDTO;
import com.example.mapstruct.entity.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer toEntity(CustomerDTO customerDTO);

    CustomerDTO toDto(Customer customer);
}
