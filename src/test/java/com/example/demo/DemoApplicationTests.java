package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.entiy.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Test
	public void contextLoads() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("小黑");
		userInfo.setUserAge(10);
		UserInfo mUserInfo = userRepository.save(userInfo);
		Assert.assertNotNull(mUserInfo);//mUserInfo不为空
	}

	//根据主键查询
	@Test
	public void getOne(){
		UserInfo userInfo = userRepository.findOne(1);
		System.out.println(userInfo);
	}

	@Test
	public void findAll(){
		List<UserInfo> userInfos = userRepository.findAll();

		//lambda表达式
		userInfos.forEach(a -> System.out.println(a.getUserName()));
	}

	@Test
	public void update(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(4);
		userInfo.setUserName("嘿嘿");
		userInfo.setUserAge(100);
		userRepository.save(userInfo);
	}




}
