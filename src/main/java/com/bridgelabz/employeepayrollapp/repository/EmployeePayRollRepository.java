package com.bridgelabz.employeepayrollapp.repository;


import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeePayRollRepository extends JpaRepository <EmployeePayrollData,Integer>{

}
