package com.baidu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.po.Register;
import com.baidu.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	 @RequestMapping("regist")  
	    public String getList(Register register,Model model){  
	          
	        System.out.println("用户注册："+register.getLname()+register.getPasswoed());  
	          
	        register.setRid(1);  
	        userService.getList(register);  
	          
	        model.addAttribute("msg", "注册成功");  
	        //注册成功后跳转success.jsp页面  
	        return "success";  
	    }  
	      
	    @RequestMapping("login")  
	    public String login(String lname,String passwoed,Model model){  
	          
	        System.out.println("用户登录："+lname+passwoed);  
	          
	        /*Map<String, String> map=new LinkedHashMap<String,String>(); 
	         
	        map.put("name", user.getName()); 
	        map.put("password", user.getPassword());*/  
	          
	        userService.login(lname,passwoed);  
	          
	        model.addAttribute("msg", "登录成功");  
	          
	        return "success";  
	    }  
	
}
