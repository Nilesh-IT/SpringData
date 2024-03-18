package com.nil.demo.service;

import java.util.List;

import com.nil.demo.commons.Patient;

public interface IPatientService {
	// sort patient 
	public List<Patient> sortPatient(String asc);
	
	//paganation
	public List<Patient> paginatePatient(int pgNo, int pageSize);

}
