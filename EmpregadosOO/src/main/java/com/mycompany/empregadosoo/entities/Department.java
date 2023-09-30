/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregadosoo.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Department {
    
    private String name;
    private int payDay;
    private Adress adress;
    
    List<Employee> employees = new ArrayList();

    public Department() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public Department(String name, int payDay, Adress adress) {
        this.name = name;
        this.payDay = payDay;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void removeEmployee(Employee employee){
        employees.add(employee);
    }
    
    public Double getVendas(){
        Double vendas = 0.0;
        for (Employee employee : employees){
            vendas = vendas + employee.getSalary();
        }
        
        return vendas;
    }

    public Adress getAdress() {
        return adress;
    }
}
