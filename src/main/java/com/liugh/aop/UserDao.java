package com.liugh.aop;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void findUser(){
		String sql="select * from ly_user";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		System.out.println(queryForList.toString());
	}
	
	public void updateUser(){
		String sql="update  ly_user set userName = 'liugh' where id = '1'";
		System.out.println("update...");
		jdbcTemplate.update(sql);
	}

}
