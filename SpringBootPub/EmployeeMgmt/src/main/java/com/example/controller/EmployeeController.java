package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Employee;
import com.example.reprository.EmployeeReprository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeReprository employeeReprository;
	
	@GetMapping("/welcome")
	public Employee getEmployee(){
		
		Employee e = new Employee((long) 1,"Ravi","Software",50);
		return e;
	}
	
	@GetMapping("/welcomepage")
	public ModelAndView getEmployeePage(){
		
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
	public String newEmployee(Employee employee) {

		employeeReprository.save(employee);
		return ("redirect:/list.html");

	}

	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.GET)
	public ModelAndView addNewEmployee() {

		Employee emp = new Employee();
		return new ModelAndView("newEmployee", "form", emp);

	}

	@RequestMapping(value = "/listEmployees.html", method = RequestMethod.GET)
	public ModelAndView employees() {
		List<Employee> allEmployees = employeeReprository.findAll();
		return new ModelAndView("allEmployees", "employees", allEmployees);

	}
}
