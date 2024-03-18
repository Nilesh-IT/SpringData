package com.nil.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nil.demo.commons.Patient;

public interface IPatientRepo  extends PagingAndSortingRepository<Patient,Integer> {

}
