package com.springboot.service;

import java.util.List;

import com.springboot.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department dept);
	public List<Department> viewAllDepartments();
}