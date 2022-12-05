/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author Asus
 */
public class HMRoomProperty {

    private int IDBill;
    private String IDProp;
    private boolean isBroke;

    public HMRoomProperty() {
    }

    public HMRoomProperty(int IDBill, String IDProp, boolean isBroke) {
        this.IDBill = IDBill;
        this.IDProp = IDProp;
        this.isBroke = isBroke;
    }

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
    }

    public String getIDProp() {
        return IDProp;
    }

    public void setIDProp(String IDProp) {
        this.IDProp = IDProp;
    }

    public boolean isIsBroke() {
        return isBroke;
    }

    public void setIsBroke(boolean isBroke) {
        this.isBroke = isBroke;
    }

}
