package com.Arc.service;

import java.util.List;
import java.util.Optional;

import com.Arc.entity.Emp;

public interface EmployeeService {
	
	Emp saveEmp(Emp emp);
	
	List<Emp> getAllEmp();
	
	void deleteEmp(Emp emp);
	
	Optional<Emp> getEmpById(int id);
	
	

}
