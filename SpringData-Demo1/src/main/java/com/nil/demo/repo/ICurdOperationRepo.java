package com.nil.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nil.demo.commons.Doctor;
import com.nil.demo.commons.Employee;

public interface ICurdOperationRepo extends CrudRepository<Doctor,Integer>
{
	
}