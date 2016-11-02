package com.dao;

import org.springframework.stereotype.Repository;

import com.bean.Cup;
@Repository
public class CupDaoImpl extends BaseDao implements CupDao {

	@Override
	public void saveCup(Cup cup) {
		String sql="insert into cup values(?,?,?)";
		int count=this.jdbcTemplate.update(sql, new Object[]{cup.getCupId(),cup.getCupPrice(),cup.getCupBrand()});
		System.out.println(count);
	}

}
