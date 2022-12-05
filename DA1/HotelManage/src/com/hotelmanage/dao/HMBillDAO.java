/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMBill;
import com.hotelmanage.utils.SqlStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class HMBillDAO extends HMDAO<HMBill, Integer> {

    String INSERT_SQL = "INSERT INTO tb_Bill VALUES(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE tb_Bill SET IDBill = ?, IDCus = ?, IDRoom = ?, ID User = ?, CheckInDay = ?, CheckOutDay = ?, Amount = ?";
    String DELETE_SQL = "DELETE FROM tb_Customer WHERE IDBill = ?";
    String SELECT_ALL_SQL = "SELECT * FROM tb_Bill";
    String SELECT_BY_ID_SQL = "SELECT * FROM tb_Bill WHERE IDBill = ?";

    @Override
    public void insert(HMBill entity) {
        SqlStatement.update(INSERT_SQL, entity.getIDCus(), entity.getIDRoom(), entity.getIDUser(), entity.getCheckInD(), entity.getCheckOutD(), entity.getAmount());
    }

    @Override
    public void update(HMBill entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIDBill(), entity.getIDCus(), entity.getIDRoom(), entity.getIDUser(), entity.getCheckInD(), entity.getCheckOutD(), entity.getAmount());
    }

    @Override
    public void delete(Integer id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMBill> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMBill selectById(Integer id) {
        List<HMBill> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMBill> selectBySQL(String sql, Object... args) {
         List<HMBill> list = new ArrayList<HMBill>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMBill nv = new HMBill();
                    list.add(nv);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
