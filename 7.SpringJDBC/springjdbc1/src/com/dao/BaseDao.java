package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BaseDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
}
