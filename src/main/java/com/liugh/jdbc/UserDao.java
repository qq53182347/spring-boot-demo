package com.liugh.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void findUser(){
		String sql="select * from ly_user";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		System.out.println(queryForList.toString());
	}
	
	@Transactional(rollbackFor=Exception.class)
//	@Transactional(noRollbackFor=Exception.class)
	public void upcateUser(){
		String sql="update  ly_user set userName = 'liugh1' where id = '1'";
		jdbcTemplate.update(sql);
//		throw new NullPointerException();
	}

}
