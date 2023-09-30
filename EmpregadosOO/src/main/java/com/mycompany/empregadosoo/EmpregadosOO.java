/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.empregadosoo;

import com.mycompany.empregadosoo.entities.Adress;
import com.mycompany.empregadosoo.entities.Department;
import com.mycompany.empregadosoo.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EmpregadosOO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do departamento: ");
        String deptName = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int deptPayDay = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();
        Adress adress = new Adress(email, phone);
        Department dept = new Department(deptName, deptPayDay, adress);
        
        System.out.print("Quantos funcionários tem o departamento? ");
        int qtd = sc.nextInt();
        
        for(int i=1;i<=qtd;i++){
            System.out.println("Dados do funcionário " + i + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary =sc.nextDouble();
            Employee employee = new Employee(name, salary);
            dept.addEmployee(employee);
        }
        
        
        showReport(dept);
        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("");
        StringBuilder sb = new StringBuilder();
        sb.append("FOLHA DE PAGAMENTO:\n");
        sb.append("Departamento Vendas = R$ " + dept.getVendas() + "\n");
        sb.append("Pagamento realizado no dia " + dept.getPayDay() + "\n");
        sb.append("Funcionários: \n");
        for (Employee employee : dept.getEmployees()){
            sb.append(employee.getName() + "\n");
        }
        sb.append("Para dúvidas favor entrar em contato: " + dept.getAdress().getEmail());
        
        System.out.println(sb.toString());
    }
}
