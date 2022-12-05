/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMBranch;
import com.hotelmanage.entity.HMBranch;
import com.hotelmanage.utils.SqlStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duchmps23300
 */
public class HMBranchDAO extends HMDAO<HMBranch, String>{
    String INSERT_SQL = "INSERT INTO ...";
    String UPDATE_SQL = "UPDATE ... SET ...";
    String DELETE_SQL = "DELETE FROM ... WHERE ...";
    String SELECT_ALL_SQL = "SELECT * FROM ...";
    String SELECT_BY_ID_SQL = "SELECT * FROM ... WHERE ...";
    
    @Override
    public void insert(HMBranch entity) {
        SqlStatement.update(INSERT_SQL, entity.getIdBranch(), entity.getNameBranch(), entity.getPhoneNumBranch(), entity.getFaxBranch(), entity.getEmailBranch(), entity.getAddressBranch());
    }


    @Override
    public void update(HMBranch entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdBranch(), entity.getNameBranch(), entity.getPhoneNumBranch(), entity.getFaxBranch(), entity.getEmailBranch(), entity.getAddressBranch());
    }

    @Override
    public void delete(String id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMBranch> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMBranch selectById(String id) {
        List<HMBranch> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }
 
    @Override
    protected List<HMBranch> selectBySQL(String sql, Object... args) {
        List<HMBranch> list = new ArrayList<HMBranch>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMBranch nv = new HMBranch();
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

    public List<HMBranch> selectByKeywords(String key) {
        String sql = "SELECT * FROM ... WHERE ... LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
}
