/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotelmanage.dao;

import com.hotelmanage.entity.HMRoom;
import com.hotelmanage.utils.SqlStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duchmps23300
 */
public class HMRoomDAO extends HMDAO<HMRoom, Integer> {

    String INSERT_SQL = "INSERT INTO tb_Room VALUES(?,?,?,?,?,)";
    String UPDATE_SQL = "UPDATE tb_Room SET IDRoom = ?, Statuss = ?, RoomFloor = ?, RoomType = ?, RoomPrice = ?";
    String DELETE_SQL = "DELETE FROM tb_Room WHERE IDRoom = ?";
    String SELECT_ALL_SQL = "SELECT * FROM tb_Room";
    String SELECT_BY_ID_SQL = "SELECT * FROM tb_Room WHERE IDRoom = ?";

    @Override
    public void insert(HMRoom entity) {
        SqlStatement.update(INSERT_SQL, entity.getIdRoom(), entity.isStatus(), entity.getRoomFloor(), entity.getRoomType());
    }

    @Override
    public void update(HMRoom entity) {
        SqlStatement.update(UPDATE_SQL, entity.getIdRoom(), entity.isStatus(), entity.getRoomFloor(), entity.getRoomType());
        SqlStatement.update(UPDATE_SQL, entity.getIdRoom(), entity.getNameRoom(), entity.isStatus(), entity.getIdFloor(), entity.getIdTypeRoom());
    }

    @Override
    public void delete(Integer id) {
        SqlStatement.update(DELETE_SQL, id);
    }

    @Override
    public List<HMRoom> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HMRoom selectById(Integer id) {
        List<HMRoom> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HMRoom> selectBySQL(String sql, Object... args) {
        List<HMRoom> list = new ArrayList<HMRoom>();
        try {
            ResultSet rs = null;
            try {
                rs = SqlStatement.query(sql, args);
                while (rs.next()) {
                    HMRoom nv = new HMRoom();
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

    public List<HMRoom> selectByKeywords(String key) {
        String sql = "SELECT * FROM ... WHERE ... LIKE ?";
        return this.selectBySQL(sql, "%" + key + "%");
    }
}
