/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMCustomers {
    private String idCustomers;
    private String nameCustomers;
    private String phoneNumCustomers;
    private String identify;
    private String addressCustomers;
    private String emailCustomers;
    
    public HMCustomers() {
    }

    public HMCustomers(String idCustomers, String nameCustomers, String phoneNumCustomers, String identify, String addressCustomers, String emailCustomers) {
        this.idCustomers = idCustomers;
        this.nameCustomers = nameCustomers;
        this.phoneNumCustomers = phoneNumCustomers;
        this.identify = identify;
        this.addressCustomers = addressCustomers;
        this.emailCustomers = emailCustomers;
    }

    public String getIdCustomers() {
        return idCustomers;
    }

    public String getNameCustomers() {
        return nameCustomers;
    }

    public String getPhoneNumCustomers() {
        return phoneNumCustomers;
    }

    public String getIdentify() {
        return identify;
    }

    public String getAddressCustomers() {
        return addressCustomers;
    }

    public String getEmailCustomers() {
        return emailCustomers;
    }

    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public void setNameCustomers(String nameCustomers) {
        this.nameCustomers = nameCustomers;
    }

    public void setPhoneNumCustomers(String phoneNumCustomers) {
        this.phoneNumCustomers = phoneNumCustomers;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public void setAddressCustomers(String addressCustomers) {
        this.addressCustomers = addressCustomers;
    }

    public void setEmailCustomers(String emailCustomers) {
        this.emailCustomers = emailCustomers;
    }


   
}
