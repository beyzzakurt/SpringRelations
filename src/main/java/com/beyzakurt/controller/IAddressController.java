package com.beyzakurt.controller;

import com.beyzakurt.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(long id);
}
