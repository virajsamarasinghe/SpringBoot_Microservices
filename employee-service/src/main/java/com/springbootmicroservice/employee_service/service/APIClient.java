package com.springbootmicroservice.employee_service.service;


import com.springbootmicroservice.employee_service.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:9090", name = "DEPARTMENT-SERVICE")
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("api/v1/departments/{code}")
    DepartmentDto getDepartment(@PathVariable(value = "code") String departmentCode);
}
