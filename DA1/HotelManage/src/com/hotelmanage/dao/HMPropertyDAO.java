/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

//import com.hotelmanage.entity.HMProperty;
import com.hotelmanage.entity.HMProperty;
import com.hotelmanage.utils.SqlStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duchmps23300
 */
public class HMPropertyDAO extends HMDAO<HMProperty, String> {

    String INSERT_SQL = "INSERT INTO tb_Property VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE tb_Property SET IDProp = ?, PropName = ?, Price = ?";
    String DELETE_SQL = "DELETE FROM tb_Property WHERE IDProp = ?";
    String SELECT_ALL_SQL = "SELECT * FROM tb_Property";
    String SELECT_BY_ID_SQL = "SELECT * FROM tb_Property WHERE IDProp = ?";

    @Override
    public void insert(HMProperty entity) {
        SqlStatement.update(INSERT_SQL, entity.getIdProperty(), entity.getNameProperty(), entity.getPriceProperty());

    }

    @Override
    public void update(HMProperty entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdProperty(), entity.getNameProperty(), entity.getPriceProperty());
        SqlStatement.update(UPDATE_SQL, entity.getIdProperty(), entity.getNameProperty(), entity.getPriceProperty(), entity.getIdBranch());
    }

    @Override
    public void delete(String id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMProperty> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMProperty selectById(String id) {
        List<HMProperty> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMProperty> selectBySQL(String sql, Object... args) {
        List<HMProperty> list = new ArrayList<HMProperty>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMProperty nv = new HMProperty();
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

    public List<HMProperty> selectByKeywords(String key) {
        String sql = "SELECT * FROM ... WHERE ... LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
}
