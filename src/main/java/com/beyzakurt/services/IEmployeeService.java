package com.beyzakurt.services;

import com.beyzakurt.dto.DtoEmployee;
import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> getAllEmployees();
}
