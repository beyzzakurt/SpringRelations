package com.beyzakurt.controller;

import com.beyzakurt.dto.DtoHome;

public interface IHomeController {
    public DtoHome getHomeById(Long id);
}
