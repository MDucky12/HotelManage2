/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMProperty {
    private String idProperty;
    private String nameProperty;
    private float priceProperty;
    private String idBranch;

    public HMProperty() {
    }

    public HMProperty(String idProperty, String nameProperty, float priceProperty, String idBranch) {
        this.idProperty = idProperty;
        this.nameProperty = nameProperty;
        this.priceProperty = priceProperty;
        this.idBranch = idBranch;
    }

    public String getIdProperty() {
        return idProperty;
    }
    
    public void setIdProperty(String idProperty) {
        this.idProperty = idProperty;
    }

    public String getNameProperty() {
        return nameProperty;
    }

    public void setNameProperty(String nameProperty) {
        this.nameProperty = nameProperty;
    }


    public float getPriceProperty() {
        return priceProperty;
    }


    public String getIdBranch() {
        return idBranch;
    }


    public void setPriceProperty(float priceProperty) {
        this.priceProperty = priceProperty;
    }


    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }
    
    
}
