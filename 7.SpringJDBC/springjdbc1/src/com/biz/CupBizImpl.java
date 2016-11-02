package com.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Cup;
import com.dao.CupDao;

@Service
public class CupBizImpl {
	@Autowired
	private CupDao cupDao;
	public void addCup(Cup cup){
		this.cupDao.saveCup(cup);
	}
}
