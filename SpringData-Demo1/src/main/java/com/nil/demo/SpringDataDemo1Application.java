package com.nil.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nil.demo.commons.Patient;
import com.nil.demo.service.DoctorService;
import com.nil.demo.service.PatientService;

@SpringBootApplication
public class SpringDataDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataDemo1Application.class, args);
		DoctorService doctor = run.getBean("doctorService", DoctorService.class);
		PatientService patient = run.getBean("patientService", PatientService.class);
		// doctor.registerDoctor();
		List<Patient> sortPatient = patient.sortPatient("ASC");
		sortPatient.forEach(p -> System.out.println(p));
	patient.paginatePatient(1,1).forEach(p->System.out.println("page"+p));;

	}

}
