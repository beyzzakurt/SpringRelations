package com.beyzakurt.controller;

import com.beyzakurt.dto.DtoEmployee;
import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> getAllEmployees();
}
