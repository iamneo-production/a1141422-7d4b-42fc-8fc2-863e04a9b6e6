package com.examly.springapp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="custmlogin")
public class CustmLogin_Enty {

    @Id
    @Column(name = "custm_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custmid;

    @Column(name = "custm_name", length = 255)
    private String custmname;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    public CustmLogin_Enty(int custmid, String custmname, String email, String password) {

        this.custmid = custmid;
        this.custmname = custmname;
        this.email = email;
        this.password = password;
    }

    public CustmLogin_Enty() {
    }

    public int getCustmid() {
        return custmid;
    }

    public void setCustmid(int employeeid) {
        this.custmid = employeeid;
    }

    public String getCustmname() {
        return custmname;
    }

    public void setCustmname(String employeename) {
        this.custmname = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        return "CustmLogin_Enty{" +
                "custmid=" + custmid +
                ", custmname='" + custmname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
