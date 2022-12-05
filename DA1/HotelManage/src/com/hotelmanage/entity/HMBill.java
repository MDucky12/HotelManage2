    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author Asus
 */
public class HMBill {
    private int IDBill;
    private int IDCus;
    private String IDRoom;
    private String IDUser;
    private String checkInD;
    private String checkOutD;
    private int Amount;

    public HMBill() {
    }

    public HMBill(int IDBill, int IDCus, String IDRoom, String IDUser, String checkInD, String checkOutD, int Amount) {
        this.IDBill = IDBill;
        this.IDCus = IDCus;
        this.IDRoom = IDRoom;
        this.IDUser = IDUser;
        this.checkInD = checkInD;
        this.checkOutD = checkOutD;
        this.Amount = Amount;
    }

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
    }

    public int getIDCus() {
        return IDCus;
    }

    public void setIDCus(int IDCus) {
        this.IDCus = IDCus;
    }

    public String getIDRoom() {
        return IDRoom;
    }

    public void setIDRoom(String IDRoom) {
        this.IDRoom = IDRoom;
    }

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public String getCheckInD() {
        return checkInD;
    }

    public void setCheckInD(String checkInD) {
        this.checkInD = checkInD;
    }

    public String getCheckOutD() {
        return checkOutD;
    }

    public void setCheckOutD(String checkOutD) {
        this.checkOutD = checkOutD;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    
    
}
