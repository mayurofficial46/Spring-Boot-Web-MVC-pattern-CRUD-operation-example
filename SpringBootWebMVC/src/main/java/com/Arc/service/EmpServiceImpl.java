package com.Arc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arc.entity.Emp;
import com.Arc.repo.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Emp saveEmp(Emp emp) {
		
		return repository.save(emp);
	}

	@Override
	public List<Emp> getAllEmp() {
		
		return repository.findAll();
	}

	@Override
	public void deleteEmp(Emp emp) {
			repository.delete(emp);
		
	}

	@Override
	public Optional<Emp> getEmpById(int id) {
		
		return repository.findById(id);
	}

}
