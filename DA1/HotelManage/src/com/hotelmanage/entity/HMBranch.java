/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMBranch {
    private String idBranch;
    private String nameBranch;
    private String phoneNumBranch;
    private String faxBranch;
    private String emailBranch;
    private String addressBranch;

    public HMBranch() {
    }

    public HMBranch(String idBranch, String nameBranch, String phoneNumBranch, String faxBranch, String emailBranch, String addressBranch) {
        this.idBranch = idBranch;
        this.nameBranch = nameBranch;
        this.phoneNumBranch = phoneNumBranch;
        this.faxBranch = faxBranch;
        this.emailBranch = emailBranch;
        this.addressBranch = addressBranch;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public String getNameBranch() {
        return nameBranch;
    }

    public String getPhoneNumBranch() {
        return phoneNumBranch;
    }

    public String getFaxBranch() {
        return faxBranch;
    }

    public String getEmailBranch() {
        return emailBranch;
    }

    public String getAddressBranch() {
        return addressBranch;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public void setNameBranch(String nameBranch) {
        this.nameBranch = nameBranch;
    }

    public void setPhoneNumBranch(String phoneNumBranch) {
        this.phoneNumBranch = phoneNumBranch;
    }

    public void setFaxBranch(String faxBranch) {
        this.faxBranch = faxBranch;
    }

    public void setEmailBranch(String emailBranch) {
        this.emailBranch = emailBranch;
    }

    public void setAddressBranch(String addressBranch) {
        this.addressBranch = addressBranch;
    }
    
    
}
