package com.examly.springapp.response;

public class LoginResponse2 {
    String message;
    Boolean status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;

    public LoginResponse2() {
    }

    public LoginResponse2(String message, Boolean status, String email) {
        this.message = message;
        this.status = status;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }



}
