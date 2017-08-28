package com.training.SpringFundamentalSpringBoot1.controller;

import com.training.SpringFundamentalSpringBoot1.domail.Employee;
import com.training.SpringFundamentalSpringBoot1.repository.EmployeeJpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController /*component*/
public class EmployeeController {

    List<Employee> employeeList = new ArrayList<>();

    @Autowired /*Bean*/
    EmployeeJpsRepository employeeJpsRepository;

    {
        Employee pichai = new Employee();
        pichai.setId(1);
        pichai.setFirstName("Pichai");
        pichai.setLastName("Limpanitivat");

        Employee john = new Employee();
        john.setId(2);
        john.setFirstName("John");
        john.setLastName("Suchar");

        employeeList.add(pichai);
        employeeList.add(john);
    }

    //TODO Create
    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee) {

//        employeeList.add(employee);

        //TODO JspRepository
        employeeJpsRepository.save(employee);

        return employee;
    }

    //TODO Update
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeParam) {

        System.out.println("id = [" + id + "]");

        //TODO Get method for using and Update data
        /*Employee employee = getEmployee(id);
        if (employee == null) {
            return null;
        }
        employee.setFirstName(employeeParam.getFirstName());
        employee.setLastName(employeeParam.getLastName());*/

        /*for(Employee employee : employeeList){
            if(employee.getId().equals(id)){
                employee.setFirstName(employeeParam.getFirstName());
                employee.setLastName(employeeParam.getLastName());
                return employee;
            }
        }*/

        //TODO JspRepository
        Employee employee = employeeJpsRepository.getEmployeeById(id);
        if (employee == null) {
            throw new RuntimeException("asdf" + id);
        }
        employeeJpsRepository.save(employee);

        return employeeParam;
    }

    //TODO Delete
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Integer id) {
        System.out.println("id = [" + id + "]");

        //TODO Get method for using and remove data
        /*Employee employee = getEmployee(id);
        employeeList.remove(employee);*/

        /*for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                employeeList.remove(employee);
            }
        }*/

        //TODO JspRepository
        Employee employee1 = getEmployee(id);

        employeeJpsRepository.deleteEmployeeById(employee1);
    }


    //TODO GetAll
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> listAllEmployeeAll() {

        return employeeJpsRepository.findAllEmployees();
    }

    //TODO GetById
    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable Integer id) {

        System.out.println("dispaly id: " + id);

        /*for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }*/

        return employeeJpsRepository.getEmployeeById(id);
    }


}
