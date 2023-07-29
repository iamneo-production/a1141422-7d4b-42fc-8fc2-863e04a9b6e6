package com.examly.springapp.Dto;

public class CustmDTO {

    private int custmid;
    private String custmname;
    private String email;
    private String password;

    public CustmDTO(int custmid, String custmname, String email, String password) {
        
        this.custmid = custmid;
        this.custmname = custmname;
        this.email = email;
        this.password = password;
    }

    public CustmDTO() {
    }

    public int getCustmid() {
        return custmid;
    }

    public void setCustmid(int custmid) {
        this.custmid = custmid;
    }

    public String getCustname() {
        return custmname;
    }

    public void setCustmname(String custmname) {
        this.custmname = custmname;
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

        return "CustmDTO{" +
                "custmid=" + custmid +
                ", custmname='" + custmname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
