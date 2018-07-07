package com.baidu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baidu.mapper.RegisterMapper;
import com.baidu.po.Register;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private RegisterMapper rmapperp;
	@Override
	public void getList(Register register) {
		// TODO Auto-generated method stub
		rmapperp.selectByExample(null);
	}

	@Override
	public void login(String lname, String passwoed) {
		// TODO Auto-generated method stub
		rmapperp.selectByExample(null);
	}

}
