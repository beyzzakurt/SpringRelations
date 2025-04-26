package com.beyzakurt.services;

import com.beyzakurt.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer getCustomerById(Long id);
}
