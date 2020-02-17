package com.example.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Employee;

public interface EmployeeReprository extends JpaRepository<Employee, Long>{



}
