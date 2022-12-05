/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.entity;

/**
 *
 * @author duchmps23300
 */
public class HMService {

    private int idService;
    private String nameService;
    private String priceService;
    private int idRoom;
    private String idBranch;

    public HMService() {
    }

    public HMService(int idService, String nameService, String priceService) {
        this.idService = idService;
        this.nameService = nameService;
        this.priceService = priceService;

    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public void setIdBranch(String idBranch) {
        this.idBranch = idBranch;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public String getIdBranch() {
        return idBranch;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getPriceService() {
        return priceService;
    }

    public void setPriceService(String priceService) {
        this.priceService = priceService;

    }
    
    
}
