package com.example.lectionuserbd;

public class User {
    public String Login;
    public String password;
    public String email;
    public String phone;

    public User(String login, String password, String email, String phone) {
        Login = login;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getLogin() {
        return Login;
    }



    public String getPassword() {
        return password;
    }



    public String getEmail() {
        return email;
    }


    public String getPhone() {
        return phone;
    }



}

