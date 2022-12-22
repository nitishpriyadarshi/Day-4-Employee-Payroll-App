package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import com.bridgelabz.employeepayrollapp.repository.EmployeePayRollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    @Autowired
    EmployeePayRollRepository employeePayRollRepository;
    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayRollRepository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empdata =  employeePayRollRepository.findById(empId).get();
        return empdata;


    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
       EmployeePayrollData empData = new EmployeePayrollData(empPayrollDTO);
       employeePayRollRepository.save(empData);

        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO) {

        EmployeePayrollData empData=new EmployeePayrollData(empId,empPayrollDTO);
        employeePayRollRepository.save(empData);
        return empData;

    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayRollRepository.deleteById(empId);
    }
}
