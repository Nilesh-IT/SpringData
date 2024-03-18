package com.nil.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nil.demo.commons.Patient;
import com.nil.demo.repo.IPatientRepo;

@Service
public class PatientService implements IPatientService {
	@Autowired
	IPatientRepo prepo;

	@Override
	public List<Patient> sortPatient(String asc) {
		Iterable<Patient> all = prepo.findAll(Sort.by(asc != null ? Direction.ASC : Direction.DESC, "name"));
		ArrayList<Patient> patientList = new ArrayList<>();
		for (Patient patient : all) {
			patientList.add(patient);
		}
		System.out.println("Sort" + all);
		return patientList;
	}

	@Override
	public List<Patient> paginatePatient(int pgNo, int pageSize) {
		PageRequest request = PageRequest.of(pgNo, pageSize);
		 Page<Patient> page = prepo.findAll(request);
		 long totalElements = page.getTotalElements();
		 System.out.println(totalElements);
		return null;
	}

}
