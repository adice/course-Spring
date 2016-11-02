package com.course.loginuser.dao;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

import com.course.entity.LoginUser;
import com.framework.BaseDao;

@Repository
public class LoginUserDaoImpl extends BaseDao<LoginUser,String> {

	public LoginUser findByNamdAndPwd(String name,String pwd){
		try{
			return super.findOne("from LoginUser lu where lu.loginName=? and lu.password=?", new Object[]{name,pwd});
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
