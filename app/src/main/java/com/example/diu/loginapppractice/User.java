package com.example.diu.loginapppractice;

public class User {
    
    private String username;
    private String password;
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
    //check login
    public boolean  verifyLogin(){
        if(username.equalsIgnoreCase("Rabbi") && password.equals("Password")){
            return true;
        }
        else{
            return false;
        }
    }
}
