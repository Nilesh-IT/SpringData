package com.nil.demo.commons;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer pId;
	private String name;
	private String address;
	private Long contactNo;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Patient(Integer pId, String name, String address, Long contactNo) {
		super();
		this.pId = pId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contactNo, name, pId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(address, other.address) && Objects.equals(contactNo, other.contactNo)
				&& Objects.equals(name, other.name) && Objects.equals(pId, other.pId);
	}

}
