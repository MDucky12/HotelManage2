/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMStaff {
    private int IdUser;
    private String username;
    private String password;
    private String IdBranch;

    public HMStaff() {
    }

    public HMStaff(int IdUser, String username, String password, String IdBranch) {
        this.IdUser = IdUser;
        this.username = username;
        this.password = password;
        this.IdBranch = IdBranch;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIdBranch() {
        return IdBranch;
    }

    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdBranch(String IdBranch) {
        this.IdBranch = IdBranch;
    }   
}
