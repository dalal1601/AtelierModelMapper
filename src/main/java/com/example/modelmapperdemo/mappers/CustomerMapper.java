package com.example.modelmapperdemo.mappers;

import com.example.modelmapperdemo.dao.entities.Customer;
import com.example.modelmapperdemo.dtos.CustomerDto;
import com.example.modelmapperdemo.dtos.CustomerDtoNew;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public CustomerDto fromCustomer(Customer customer) {
        return this.modelMapper.map(customer, CustomerDto.class);
    }

    public CustomerDtoNew fromCustomerToNewDto(Customer customer) {
        return this.modelMapper.map(customer, CustomerDtoNew.class);
    }
}