
package com.bean;

import sun.security.util.Password;


public class LoginBean {
    private String username, fullName, userType;
    private String password;
    public LoginBean() {
    }

    public LoginBean(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public LoginBean(String username, String fullName, String userType, String password) {
        this.username = username;
        this.fullName = fullName;
        this.userType = userType;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString() {
        return "LoginBean{" + "username=" + username + ", password=" + password + ", userType=" + userType + '}';
    }
    
}
