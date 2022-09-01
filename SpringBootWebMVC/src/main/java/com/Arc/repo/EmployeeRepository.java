package com.Arc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arc.entity.Emp;

public interface EmployeeRepository extends JpaRepository<Emp, Integer> {

}
