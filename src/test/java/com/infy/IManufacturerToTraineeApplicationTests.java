package com.infy;

import static org.junit.Assert.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.infy.dto.EmployeeDTO;
import com.infy.exception.InfyEmployeeException;
import com.infy.repository.EmployeeRepository;
import com.infy.service.EmployeeServiceImpl;

public class IManufacturerToTraineeApplicationTests {
	
	@MockBean
	private EmployeeRepository employeeRepository;
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

	@Test
	public void addEmployeeInvalidEmailId() throws Exception {
//		EmployeeDTO employee = new EmployeeDTO();
//		employee.setEmailId("wilsongmail.com");
//		
//		Mockito.when(employeeServiceImpl.addEmployee(employee).thenThrow(InfyEmployeeException.class));
//		
//		Mockito.when(this.employeeServiceImpl.addEmployee(employee));
//		String actual = 
//		Assertion.assertEquals("Validator.INVALID_EMAIL_ID", actual);
	}

	public void getEmployeeInvalidEmployeeId() throws Exception {
	}

	public void updateEmployeeInvalidEmployeeId() throws Exception {
	}

	public void deleteEmployeeInvalidEmployeeId() throws Exception {
	}

}
