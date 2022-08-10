package model;

import jakarta.persistence.*;
import org.springframework.stereotype.Controller;

@Entity
@Table(name = "empdata")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empCode")
    private int empcode;

    @Column(name = "empName")
    private String empname;
    @Column(name = "designation")
    private String  designation;

    @Column(name = "email")
    private String email;

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
