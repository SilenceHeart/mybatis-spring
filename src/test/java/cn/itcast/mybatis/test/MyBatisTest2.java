package cn.itcast.mybatis.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.itcast.mybatis_spring.entity.User;
import cn.itcast.mybatis_spring.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class MyBatisTest2 {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test() {
		Page<User> page = PageHelper.startPage(5, 3);
		List<User> userList = userMapper.selectAllUser();
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println(page.getTotal());
		System.out.println(page.getPages());
		System.out.println(page.getPageSize());
		
	}
	 
}
