/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMService;
import com.hotelmanage.utils.SqlStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class HMServiceDAO extends HMDAO<HMService, Integer> {

    String INSERT_SQL = "INSERT INTO tb_Service VALUES (?,?)";
    String UPDATE_SQL = "UPDATE tb_Service SET IDService = ?, NameService = ?, Price = ?";
    String DELETE_SQL = "DELETE FROM tb_Service WHERE IDService = ?";
    String SELECT_ALL_SQL = "SELECT * FROM tb_Service";
    String SELECT_BY_ID_SQL = "SELECT * FROM tb_Service WHERE IDService = ?";

    @Override
    public void insert(HMService entity) {
        SqlStatement.update(INSERT_SQL, entity.getNameService(), entity.getPriceService());
    }

    @Override
    public void update(HMService entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdService(), entity.getNameService(), entity.getPriceService());
    }

    @Override
    public void delete(Integer id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMService> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMService selectById(Integer id) {
        List<HMService> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMService> selectBySQL(String sql, Object... args) {
        List<HMService> list = new ArrayList<HMService>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMService dv = new HMService();
                    list.add(dv);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<HMService> selectByKeywords(String key) {
        String sql = "SELECT * FROM ... WHERE ... LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
}
