package com.infy.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infy.dto.ManufacturingUnit;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	private Integer employeeId;
	private String emailId;
	private String name;
	private LocalDate dateOfBirth;
	@Enumerated(value = EnumType.STRING)
	private ManufacturingUnit manufacturingUnit;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ManufacturingUnit getManufacturingUnit() {
		return manufacturingUnit;
	}

	public void setManufacturingUnit(ManufacturingUnit manufacturingUnit) {
		this.manufacturingUnit = manufacturingUnit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, emailId, employeeId, manufacturingUnit, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(employeeId, other.employeeId) && manufacturingUnit == other.manufacturingUnit
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emailId=" + emailId + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", manufacturingUnit=" + manufacturingUnit + "]";
	}

}
