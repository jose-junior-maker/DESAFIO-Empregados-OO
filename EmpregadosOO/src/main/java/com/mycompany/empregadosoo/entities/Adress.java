/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregadosoo.entities;

/**
 *
 * @author usuario
 */
public class Adress {
    
    private String email;
    private String phone;

    public Adress() {
    }

    public Adress(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }
    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
