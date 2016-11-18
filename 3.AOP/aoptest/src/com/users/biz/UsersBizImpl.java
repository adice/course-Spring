package com.users.biz;

import com.users.util.Md5Encode;

public class UsersBizImpl implements UsersBiz {

	public boolean regist(String userName, String userPassword) {
		System.out.println("调用dao，实现注册功能。");
		System.out.println("密码是："+userPassword);
		for(int i=0;i<101111111;i++){}
		return true;
	}

}
