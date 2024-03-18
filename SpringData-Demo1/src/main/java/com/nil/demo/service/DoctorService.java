package com.nil.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nil.demo.commons.Doctor;
import com.nil.demo.repo.ICurdOperationRepo;

@Service
public class DoctorService implements IDoctorServices {

	@Autowired
	ICurdOperationRepo repo;

	@Override
	public String registerDoctor() {
		Doctor doct = new Doctor();
		doct.setName("dr.Pavan");
		doct.setContactNo(85878585L);
		Doctor save = repo.save(doct);
		String s = save == null ? "record not saved " : "record saved";
		System.out.println(s);
		
		// save all 
		Doctor doctor = new Doctor();
		doctor.setName("dr.Abhi");
		doctor.setContactNo(8548558l);
		Doctor doctor1 = new Doctor();
		doctor1.setName("dr.shivraj");
		doctor1.setContactNo(896588l);
		List<Doctor> doctors = Arrays.asList(doctor,doctor1);
		Iterable<Doctor> saveAll = repo.saveAll(doctors);
		String s1 = save == null ? "record not saved " : "record saved";
		System.out.println(s+s1);
		
		// delete operation 
		boolean isDoctorexists = repo.existsById(1);
		if (isDoctorexists) {
			repo.delete(doctor1);
			System.out.println("record deleted"+ doctor1);
		}
		
		
		return s;
	}

}
