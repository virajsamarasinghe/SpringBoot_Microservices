package com.springbootmicroservice.employee_service.service;

import com.springbootmicroservice.employee_service.dto.ApiResponseDto;
import com.springbootmicroservice.employee_service.dto.EmployeeDto;

public interface EmployeeService  {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long id);
}
