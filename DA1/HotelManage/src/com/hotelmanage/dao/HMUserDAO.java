/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMUser;
import com.hotelmanage.utils.SqlStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author duchmps23300
 */
public class HMUserDAO extends HMDAO<HMUser, Integer> {

    String INSERT_SQL = "INSERT INTO tb_User VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE tb_User SET IDUser = ?, StaffName = ?, Birth = ?, Username = ?, Pass = ?, Role = ?, Note = ?";
    String DELETE_SQL = "DELETE FROM tb_User WHERE IDUser = ?";
    String SELECT_ALL_SQL = "SELECT * FROM tb_User";
    String SELECT_BY_ID_SQL = "SELECT * FROM tb_User WHERE IDUser = ?";

    @Override
    public void insert(HMUser entity) {
        SqlStatement.update(INSERT_SQL, entity.getStaffName(), entity.getBirth(), entity.getUsername(), entity.getPassword(), entity.getNote());
    }

    @Override
    public void update(HMUser entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdUser(), entity.getStaffName(), entity.getBirth(), entity.getUsername(), entity.getPassword(), entity.getNote());
    }

    @Override
    public void delete(Integer id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMUser> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMUser selectById(Integer id) {
        List<HMUser> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMUser> selectBySQL(String sql, Object... args) {
        List<HMUser> list = new ArrayList<HMUser>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMUser nv = new HMUser();
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

    public List<HMUser> selectByKeywords(String key) {
        String sql = "SELECT * FROM ... WHERE ... LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
}
