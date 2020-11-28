package com.rest_api.rest_api;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import com.rest_api.rest_api.bean.MyDevices;
import com.rest_api.rest_api.model.Device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("device")
public class DeviceRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DeviceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addLog(String sn,String url){
       return jdbcTemplate.update("insert into device_log (sn,log_url) values(?,?)", sn,url);
    }

    public List<Device> getDeviceByUserId(String userId,String deviceId){
        String sql="select id from user where login_token =?";
        List<Integer> id= jdbcTemplate.query(sql, new Object[]{userId},new int[]{Types.VARCHAR},new RowMapper<Integer>(){

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt("id");
			}
            
        });
        if(id.isEmpty())
        {
            return null;
        }else{
            if(deviceId==null||deviceId.equals("")){
                sql="select * from device where user_id=?";
                List<Device> re=jdbcTemplate.query(sql,new Object[]{id.get(0)},new int[]{Types.VARCHAR},new BeanPropertyRowMapper(Device.class));
                return re;
            }else{
                sql="select * from device where user_id=? and device= ?";
                List<Device> re=jdbcTemplate.query(sql,new Object[]{id.get(0),deviceId},new int[]{Types.VARCHAR,Types.VARCHAR},new BeanPropertyRowMapper(Device.class));
                return re;
            }
        }
    }

	public Iterable<String> getLogList(String userId, String device) {
        String sql="select id from user where login_token =?";
        List<Integer> id= jdbcTemplate.query(sql, new Object[]{userId},new int[]{Types.VARCHAR},new RowMapper<Integer>(){

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt("id");
			}
            
        });
        if(id.isEmpty())
        {
            return null;
        }else{
            sql="select log_url from device_log where sn=?";
            return jdbcTemplate.query(sql, new Object[]{device},new int[]{Types.VARCHAR},new RowMapper<String>(){

                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {

                     return rs.getString("log_url");
                }
                
            });
        }
	}

	public Integer setDebug(String userId, String device, int debug) {
		String sql="select id from user where login_token =?";
        List<Integer> id= jdbcTemplate.query(sql, new Object[]{userId},new int[]{Types.VARCHAR},new RowMapper<Integer>(){

			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt("id");
			}
            
        });
        if(id.isEmpty())
        {
            return null;
        }else{
            sql="update device set is_debug=? where user_id=? and device=?";
            return jdbcTemplate.update(sql, new Object[]{debug,id.get(0),device},new int[]{Types.INTEGER,Types.INTEGER,Types.VARCHAR});
        }
	}
}
