package com.springbootmicroservice.employee_service.dto;

public class ApiResponseDto {

    private EmployeeDto employeeDto;
    private DepartmentDto departmentDto;

    public ApiResponseDto() {
    }

    public ApiResponseDto(EmployeeDto employeeDto, DepartmentDto departmentDto) {
        this.employeeDto = employeeDto;
        this.departmentDto = departmentDto;
    }

    public EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

    public void setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }

    @Override
    public String toString() {
        return "ApiResponseDto{" +
                "employeeDto=" + employeeDto +
                ", departmentDto=" + departmentDto +
                '}';
    }
}
