package com.example.shileemanager.mapper;

import com.example.shileemanager.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
    public List<Customer> getCustomers();
}
