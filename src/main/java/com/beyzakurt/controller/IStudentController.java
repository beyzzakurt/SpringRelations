package com.beyzakurt.controller;

import com.beyzakurt.dto.DtoStudent;

public interface IStudentController {

    public DtoStudent getStudentById(Long id);
}
