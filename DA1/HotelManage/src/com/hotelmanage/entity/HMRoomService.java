/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author Asus
 */
public class HMRoomService {
    private int IDBill;
    private int IDService;
    private boolean Status;

    public HMRoomService() {
    }

    public HMRoomService(int IDBill, int IDService, boolean Status) {
        this.IDBill = IDBill;
        this.IDService = IDService;
        this.Status = Status;
    }

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
    }

    public int getIDService() {
        return IDService;
    }

    public void setIDService(int IDService) {
        this.IDService = IDService;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
}
