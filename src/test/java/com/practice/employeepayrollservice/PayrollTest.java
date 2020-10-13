package com.practice.employeepayrollservice;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import com.practice.employeepayrollservice.EmployeePayrollService.IOService;
public class PayrollTest {
	@Test
	public void given3EmployeesWhenWrittenToFilesShouldMatchTheGivenEntries() {
	EmployeePayrollData[] arrEmp= {new EmployeePayrollData(1, "hi", 100000.87),
			new EmployeePayrollData(2,"hello",43400.70),
			new EmployeePayrollData(3,"kush",780000.50)};
	EmployeePayrollService EPS=new EmployeePayrollService(Arrays.asList(arrEmp));
	EPS.writeData(IOService.FILE_IO);
	long count=EPS.countEntries(IOService.FILE_IO);
	System.out.println(count);
	Assert.assertEquals(3,count);
	}
}
