package com.beyzakurt.controller;

import com.beyzakurt.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer getCustomerById(Long id);
}
