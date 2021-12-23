package com.infy.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.infy.dto.EmployeeDTO;
import com.infy.entity.Employee;

@Repository(value = "employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Integer addEmployee(EmployeeDTO employeeDTO) {

		Employee employee = new Employee();
		employee.setDateOfBirth(employeeDTO.getDateOfBirth());
		employee.setEmailId(employeeDTO.getEmailId());
		employee.setEmployeeId(employeeDTO.getEmployeeId());
		employee.setName(employeeDTO.getName());
		employee.setManufacturingUnit(employeeDTO.getManufacturingUnit());
		entityManager.persist(employee);

		return employee.getEmployeeId();
	}

	@Override
	public EmployeeDTO getEmployeeDetails(Integer employeeId) {

		EmployeeDTO employeeDTO = null;
		Employee employee = entityManager.find(Employee.class, employeeId); // asking entityManager to find employee
																			// from Employee.class based on the
																			// employeeId
		if (employee != null) {
			employeeDTO = new EmployeeDTO();
			employeeDTO.setDateOfBirth(employee.getDateOfBirth());
			employeeDTO.setEmailId(employee.getEmailId());
			employeeDTO.setEmployeeId(employee.getEmployeeId());
			employeeDTO.setName(employee.getName());
			employeeDTO.setManufacturingUnit(employee.getManufacturingUnit());
		}
		return employeeDTO;
	}

	@Override
	public void updateEmployee(Integer employeeId, String emailId) {
		Integer employeeIdReturned = null;
		Employee employee = entityManager.find(Employee.class, employeeId);
		employee.setEmailId(emailId);
		employeeIdReturned = employee.getEmployeeId();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		entityManager.remove(employee);
		Integer employeeIdReturned = employee.getEmployeeId();
	}

}