package com.springbootmicroservice.department_service.service.impl;

import com.springbootmicroservice.department_service.dto.DepartmentDto;
import com.springbootmicroservice.department_service.entity.Department;
import com.springbootmicroservice.department_service.repository.DepartmentRepository;
import com.springbootmicroservice.department_service.service.DepartmentService;
import org.springframework.stereotype.Service;


@Service
public class DepartmentserviceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentserviceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto1 = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );



        return savedDepartmentDto1;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {

        Department department = departmentRepository.findByDepartmentCode(code);

        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
        return departmentDto;
    }
}
