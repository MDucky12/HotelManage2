/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMCustomers;
import java.sql.ResultSet;
import com.hotelmanage.utils.SqlStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duchmps23300
 */
public class HMCustomersDAO extends HMDAO<HMCustomers, String> {

    String INSERT_SQL = "INSERT INTO tb_Customer VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE tb_Customer SET IDCus = ?, Name = ?, Phone = ?, Email = ?, Identity = ?";
    String DELETE_SQL = "DELETE FROM tb_Customer WHERE IDCus = ?";
    String SELECT_ALL_SQL = "SELECT * FROM tb_Customer";
    String SELECT_BY_ID_SQL = "SELECT * FROM tb_Customer WHERE IDCus = ?";

    @Override
    public void insert(HMCustomers entity) {
        SqlStatement.update(INSERT_SQL, entity.getNameCustomers(), entity.getPhoneNumCustomers(), entity.getEmailCustomers(), entity.getIdentify());
    }

    @Override
    public void update(HMCustomers entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdCustomers(), entity.getNameCustomers(), entity.getPhoneNumCustomers(), entity.getEmailCustomers(), entity.getIdentify());

        SqlStatement.update(UPDATE_SQL, entity.getIdCustomers(), entity.getNameCustomers(), entity.getPhoneNumCustomers(), entity.getEmailCustomers(), entity.getAddressCustomers());
    }

    @Override
    public void delete(String id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMCustomers> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMCustomers selectById(String id) {
        List<HMCustomers> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMCustomers> selectBySQL(String sql, Object... args) {
        List<HMCustomers> list = new ArrayList<HMCustomers>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMCustomers nv = new HMCustomers();
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

    public List<HMCustomers> selectByKeywords(String key) {
        String sql = "SELECT * FROM ... WHERE ... LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
}
