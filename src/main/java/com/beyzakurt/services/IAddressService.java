package com.beyzakurt.services;

import com.beyzakurt.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(long id);
}
