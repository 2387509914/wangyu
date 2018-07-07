package com.baidu.service;

import com.baidu.po.Register;

public interface UserService {

	void getList(Register register);

	void login(String lname, String passwoed);

}
